package ch04;

public class ExplicitTypeConversion {
    public static void main(String[] args) {
        int iNum = 100;
        // 형변환 안 됨
        // byte bNum = iNum

        byte bNum = (byte)iNum;
        // 1000
        System.out.println(iNum);
        // -24
        System.out.println(bNum);

        // int는 4 바이트 byte는 1 바이트 이므로
        // 데이터를 다 담을 수 없기 때문에 데이터 유실이 일어난다.

        double dNum = 3.14;
        iNum = (int)dNum;

        // 3
        System.out.println(iNum);

        // double은 실수 자료형이고
        // int는 정수 자료형이기 때문에 실수 부분인 소수점 값은 사라지게 됨. (데이터 유실)

        float fNum = 0.9F;

        // 두 변수의 자료형이 달라서 에러 발생
        // int num2 = dNum + fNum

        // 명시적 형변환 두가지 방법

        // 3+0
        int num1 = (int)dNum + (int)fNum;

        // 3+1
        int num2 = (int) (dNum + fNum);

        // 3
        System.out.println(num1);
        // 4
        System.out.println(num2);

    }
}