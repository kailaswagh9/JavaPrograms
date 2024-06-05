package javaProgramsPkg;

public class SequentialTriplets {

    public static void main(String[] args) {
        int[] arr = {10, 13, 14, 15, 16, 19, 20, 22, 23, 24};
        findSequentialTriplets(arr);
    }

    public static void findSequentialTriplets(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            // Check if the current element, the next element, and the element after that form a sequence
            if (arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
                System.out.println(arr[i] + " -> " + arr[i + 1] + " -> " + arr[i + 2]);
            }
        }
    }
}


//output
//13 -> 14 -> 15
//14 -> 15 -> 16
//22 -> 23 -> 24


