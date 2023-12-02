package array;

public class maxElement {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 1, 7, 2, 8, 19, -2, 2, 4, 7, 8 };
        int maxEle = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > maxEle) {
                maxEle = arr[index];
            }
        }
        System.out.println(maxEle);

    }
}