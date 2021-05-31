package ch04;

public class ImplicitTypeConversion {

    public static void main(String[] args) {
        // 적은 메모리에서 큰 메모리로 형 변환 시 자연 스럽게됨
        byte bNum = 10;
        int num = bNum;

        // 형변환 없이 값이 잘들어가서 출력 됨
        // byte는 1 바이트 / int는 4 바이트 이기 때문에
        //
        System.out.println(num);

        // 형변환이 일어남
        long lNum = 10;
        // long 보다 float가 더 정밀한 수이므로 자연스럼게 형변환이 일어남
        // long 8 바이트 / float 4바이트
        float fNum = lNum;
        System.out.println(fNum);

        // 두번의 형변환이 일어남
        // 1. num -> float
        // 2. 결과 값 -> double
        double dNum = fNum + num;
    }
}
