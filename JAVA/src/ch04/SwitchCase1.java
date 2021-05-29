package ch04

public class  SwitchCase1{
    public static void main(String[] args) {
        int rank = 1;
        char madelColor = 0;
        switch(rank){
            case 1 : madelColor = 'G';
                break;
            case 2 : madelColor = 'G';
                break;
            case 3 : madelColor = 'G';
                break;
            default : madelColor = "A"
        }
        System.out.println(rank + "등 메달 색은 " +madelColor +"입니다.");
    }
}