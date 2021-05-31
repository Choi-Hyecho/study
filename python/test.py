def getJenksBreaks(dataList, numClass):
    # dataList => 등급화 할 데이터 리스트
    # numClass => 등급화 단계

    # 데이터 리스트 값 정렬 
    dataList.sort()
    mat1 = []
    
    # data 리스트 길이 만큼 반복문 
    for i in range(0, len(dataList) + 1):
        temp = []
        # 넘긴 등급숫자 만큼 반복
        for j in range(0, numClass + 1):
            temp.append(0)
        mat1.append(temp)

    mat2 = []
    for i in range(0, len(dataList) + 1):
        temp = []
        for j in range(0, numClass + 1):
            temp.append(0)
        mat2.append(temp)
    # mat1, mat2 둘다 [0,0,0,0] datalist 만큼 생성됨

    for i in range(1, numClass + 1):
        mat1[1][i] = 1
        mat2[1][i] = 0
        for j in range(2, len(dataList) + 1):
            mat2[j][i] = float('inf')
    v = 0.0
    for l in range(2, len(dataList) + 1):
        s1 = 0.0
        s2 = 0.0
        w = 0.0
        for m in range(1, l + 1):
            i3 = l - m + 1
            val = float(dataList[i3 - 1])
            s2 += val * val
            s1 += val
            w += 1
            v = s2 - (s1 * s1) / w
            i4 = i3 - 1
            if i4 != 0:
                for j in range(2, numClass + 1):
                    if mat2[l][j] >= (v + mat2[i4][j - 1]):
                        mat1[l][j] = i3
                        mat2[l][j] = v + mat2[i4][j - 1]
        mat1[l][1] = 1
        mat2[l][1] = v
    k = len(dataList)
    kclass = []
    for i in range(0, numClass + 1):
        kclass.append(0)
    kclass[numClass] = float(dataList[len(dataList) - 1])
    countNum = numClass
    while countNum >= 2:  # print "rank = " + str(mat1[k][countNum])
        id = int((mat1[k][countNum]) - 2)
        # print "val = " + str(dataList[id])
        kclass[countNum - 1] = dataList[id]
        k = int((mat1[k][countNum] - 1))
        countNum -= 1
    return kclass


def getGVF(dataList, breaks, numClass):
    """
    The Goodness of Variance Fit (GVF) is found by taking the
    difference between the squared deviations
    from the array mean (SDAM) and the squared deviations from the
    class means (SDCM), and dividing by the SDAM
    """
    dataList.sort()
    # 배열으 평균
    listMean = sum(dataList) / len(dataList)
    print
    listMean
    SDAM = 0.0
    for i in range(0, len(dataList)):
        # 원래 값에 평균을 빼고 제곱함.
        # 제곱한 거를 SDAM에 계누적해서 더함.
        sqDev = (dataList[i] - listMean) ** 2
        SDAM += sqDev
    SDCM = 0.0
    for i in range(0, numClass):
        if breaks[i] == 0:
            classStart = 0
        else:
            classStart = dataList.index(breaks[i])
            classStart += 1
        # 구해둔 breaks 값에서 그 구간의 최대, 최소 값 구함.
        classEnd = dataList.index(breaks[i + 1])
        # index로 값 찾아서 각 구간의 값 리스트 가져옴
        classList = dataList[classStart:classEnd + 1]
        # 각구간의 평균 구함.
        classMean = sum(classList) / len(classList)
        print
        classMean
        preSDCM = 0.0
        for j in range(0, len(classList)):
            # 분산정도 구하기 구간의 각 값에서 구간 편균을 빼고 제곱함.
            sqDev2 = (classList[j] - classMean) ** 2
            # 누적해서 SDCM에 더하고
            preSDCM += sqDev2
        SDCM += preSDCM
        # (SDAM - SDCM) / SDAM 로 GVP 값 구함.
    return (SDAM - SDCM) / SDAM


# written by Drew
# used after running getJenksBreaks()
def classify(value, breaks):
    for i in range(1, len(breaks)):
        if value < breaks[i]:
            return i
    return len(breaks) - 1
