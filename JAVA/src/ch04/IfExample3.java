package ch04

public class  IfExample2{
    public static void main(String[] args) {
        int age = 9;
        int charge = 0;

        if(age<0){
            charge =1000;
            System.out.println("미취학아동");
        }
        if(age<14){
            charge =2000;
            System.out.println("초등학생");
        }
        if(age<20){
            charge =2500;
            System.out.println("중고딩학생");
        }else {
            charge =3000;
            System.out.println("성인");
        }
        System.out.println("입장료는 "+charge+"원 입니다");
    }
    // if 절 여러개와의 차이 점
    // If - else 절은 여러 조건 중 하나라도 만족하면 조건을 다 건너 뛰고 조건문 다음으로 감
    // If가 여러개일 경우 조건이 맞아도 다음 조건과 비교를 하고 계속 비교함.
}