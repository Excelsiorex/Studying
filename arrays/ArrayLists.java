package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be
 * d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.
 */
class ArrayLists {
    static void getResult() {
        Scanner scanner = new Scanner(System.in);

        // Values filling
        int n = scanner.nextInt();
        List<List<Integer>> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            List<Integer> inLine = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                inLine.add(scanner.nextInt());
            }
            integers.add(inLine);
        }

        // Queries filling
        int q = scanner.nextInt();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int f = scanner.nextInt();
            int s = scanner.nextInt();
            queries.add(Arrays.asList(f, s));
        }

        // Algorithm
        for (int i = 0; i < q; i++) {
            try {
                System.out.println(integers.get(queries.get(i).get(0) - 1).get(queries.get(i).get(1) - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
