package ch04

public class Constant {
    public static void main(String[] args){
        // 상수의 경우 변수명을 대문자로 씀
        final int MAX_NUM = 100;
        final double PI =3.14;

        // final로 상수로 선언되었기 때문에 변경이 불가능함.
        // PI =3.15;


        // 상수를 선언 하면 좋은 점
        // 재활용하기 편해짐. 코드를 하나씩 찾으면서 수정하지 않아도 됨.
        final int STUDENT_NUM = 30;
        int num = 0 ;
        if(num == 30){}

        System.out.println(30);
    }
}