package ch04

public class LoopCase1 {
    public static void main(String[] args) {
        int num = 1;
        //sum을 초기화 하지 않으면 에러 발생함.
        int sum = 0;

        // while(true) 하면 무한반복 됨.
        // 웹 서비스 같은 경우 사용 서비스가 계속 제공되어야 하니까
        while (num <= 10) {
            // 복합연산자 사용
            // sum = sum+num이랑 같음
            sum += num;
            num++;
        }

        do {
            sum += num;
            num++;
        } while (num <= 10)
        System.out.println("1부터 10까지의 값은 " + sum + " 입니다.");
    }
}