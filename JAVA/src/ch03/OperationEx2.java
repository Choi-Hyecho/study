public class OperationEx2 {
    public static void main(String[] args) {
        int num = 10;
        // 해당 sout이 실행되기 전에 num에 1을 더해라
        //11
        System.out.println(++num);
        //11
        System.out.println(num);

        // 해당 sout이 실행된 후에 num에 1을 더해라
        //11
        System.out.println(num++);
        //12
        System.out.println(num);

        //--도 마찬가지임
    }
}