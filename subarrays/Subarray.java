package subarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The first line contains a single integer, n, denoting the length of array.
 * The second line contains space-separated integers describing each respective element in array.
 */
class Subarray {
    static void getResult() {
        int itemsCount = 0;
        int subArraysCount = 0;
        int[] array;

        // Input
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            itemsCount = scanner.nextInt();
            array = new int[itemsCount];
        } else {
            array = new int[1];
        }
        for (int i = 0; i < itemsCount; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        // Algorithm
        for (int i = 0; i < itemsCount; i++) {
            for (int j = i + 1; j <= itemsCount; j++) {
                int[] subArray = Arrays.copyOfRange(array, i, j);
                int sum = 0;
                for (int aSubArray : subArray) {
                    sum += aSubArray;
                }
                if (sum < 0) {
                    subArraysCount++;
                }
            }
        }
        System.out.println(subArraysCount);
    }
}
