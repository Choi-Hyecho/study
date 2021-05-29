package ch04

public class  IfExample1{
    public static void main(String[] args){
        int age = 10;
        if (age>=8){
            // 수행문이 하나 일 경우 중괄호를 쓰지 않아도 됨.
            // 가독성을 위해서는 써주는게 좋음.
            System.out.println("초등학생");
            System.out.println('test');
        }else{
            // else 블럭이 없으면 조건이 올바르지 않을 경우 아무것도 뜨지 않음.
            System.out.println("유치원 생");
        }
    }
}