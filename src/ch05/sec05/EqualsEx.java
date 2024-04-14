package ch05.sec05;

public class EqualsEx {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "A";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("==============");

        String str3 = new String("A");
        String str4 = new String("A");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println("==============");

        String str5 = "";
        System.out.println(str5.equals(""));
    }
}
