package ch05.sec05;

public class CharAtEx {
    public static void main(String[] args) {
        String ssn = "030421-4******";
        char gender = ssn.charAt(7);
        switch(gender){
            case '1':
            case '3':
                System.out.println("당신의 성별은 남성입니다.");
                break;
            case '2':
            case '4':
                System.out.println("당신의 성별은 여성입니다.");
                break;
        }

    }
}
