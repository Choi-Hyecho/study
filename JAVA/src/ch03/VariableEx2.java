public class VariableEx2 {
    public static void main(String[] args) {
        // 어딘가에 10이라는 값이 저장되어있고 그 이름이 num임
        int num = 10;
        // 자바에서 모든 정수는 4바이트로 저장함.
        // 4 바이트 이상의 큰 수는 8 바이트인 long으로 저장해야함.
        // 이때 자료형을 long으로 바꾸는 것만 아니라 숫자 끝에 식별자(L) 를 추가하여
        // 컴퓨터에게 8바이트로 저장할 수 있게 알려줘야 함.
        // 실수에서도 마찬가지

        long num = 12345657890000L;
    }
}