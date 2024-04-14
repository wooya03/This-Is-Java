package ch02.sec13;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String result1 = scanner.nextLine();
        System.out.println(result1);

        System.out.print("x 값 입력 : ");
        String str = scanner.nextLine();
        int result2 = Integer.parseInt(str);
        System.out.println(result2);

        System.out.print("정수 입력 : ");
        int result3 = scanner.nextInt();
        System.out.println(result3);
    }
}
