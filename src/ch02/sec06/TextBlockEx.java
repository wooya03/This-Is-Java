package sec06;

public class TextBlockEx {
    public static void main(String[] args) {
        String str = """
                이렇게 큰따옴표 3개로 감싸면
                이스케이프하거나 라인피드를 할 필요가 없이
                작성된 그대로
                문자열로 저장 된다.
                """;
        System.out.println(str);
    }
}
