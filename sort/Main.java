package sort;

import java.util.Arrays;

/**
 * Some sort algorithms
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[70000];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = i;
        }

        bubbleSort(arr);
        insertionSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[i - 1] > arr[i]; j--) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
