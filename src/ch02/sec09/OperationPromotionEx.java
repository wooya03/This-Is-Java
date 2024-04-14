package ch02.sec09;

public class OperationPromotionEx {
    public static void main(String[] args) {
        byte result1 = 10 + 20; // 컴파일 단계에서 연산
        System.out.println(result1); 
        
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; // int 타입으로 변환 후 연산
        System.out.println(result2);

         int v3 = 1;
         int v4 = 2;
         double result3 = (double)v3 + v4; // double 타입으로 변환 후 연산

    }
}
