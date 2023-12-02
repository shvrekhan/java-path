package array;

public class reverseArray {
    public static void main(String args[]) {
        int[] arr = { 1, 5, 3, 7, 2, 3, 1, 9, 7, 5, 4, 33, 5 };
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex < endIndex) {
            arr[startIndex] = arr[startIndex] + arr[endIndex];
            arr[endIndex] = arr[startIndex] - arr[endIndex];
            arr[startIndex] = arr[startIndex] - arr[endIndex];

            startIndex++;
            endIndex--;
        }

        for (int element : arr) {
            System.err.println(element);
        }
    }
}
