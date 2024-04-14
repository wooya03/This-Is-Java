package ch04.sec06;

public class ArrayLengthEx {
    public static void main(String[] args) {
        int[] scores = {84, 90, 96};
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
    }
}
