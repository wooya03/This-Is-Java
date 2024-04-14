package ch05.sec03;

public class ReferenceVariableCompareEx {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1,2,3};
        arr2 = new int[]{1,2,3};
        arr3 = arr2;

        System.out.println(arr1 == arr2); // 각자 객체를 생성함
        System.out.println(arr2 == arr3); // 같은 객체를 참조하고 있음
    }
}
