public class TestCom {

    // 대입되는 값이 없는 변수를 사용할 경우 var를 사용할 수 없음
    int abc;

    public static void main(String[] args) {
        var dNum = 3.14;
        flast fNum = 3.14F;
        System.out.println(dNum);

        var num = 10;
        System.out.println(num);
    }
}
