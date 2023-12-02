package array;

public class continousSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 3, 2, 5, 6, 3 };

        for (int startIndex = 0; startIndex < arr.length; startIndex++) {
            for (int endIndex = startIndex; endIndex < arr.length; endIndex++) {

                for (int index = startIndex; index <= endIndex; index++) {
                    System.out.print(arr[index] + " ");
                }
                System.out.println();
            }
        }
    }
}
