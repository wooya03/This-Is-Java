package sec09;

public class StringConcatEx {
    public static void main(String[] args) {
        // 숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println(result1);

        // 순차적으로 + 연산 수행 후 결합
        String result2 = 10 + 2 + "8";
        System.out.println(result2);

        // 먼저 수행된 연산이 결합연산임으로 이후 + 연산은 모두 결합 연산
        String result3 = 10 + "2" + 8;
        System.out.println(result3);
        String result4 = "10" + 2 + 8;
        System.out.println(result4);

        // 괄호는 항상 최우선으로 연산을 수행
        String result5 = "10" + (2+8);
        System.out.println(result5);
    }
}
