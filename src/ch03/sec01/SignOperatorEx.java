package ch03.sec01;

public class SignOperatorEx {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println(x);
        byte b = 100;
        int y = -b;
        System.out.println(y);
    }
}
