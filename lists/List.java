package lists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The first line contains an integer, N (the initial number of elements in list L).
 * The second line contains N space-separated integers describing L.
 * The third line contains an integer, Q (the number of queries).
 * The 2Q subsequent lines describe the queries, and each query is described over two lines:
 * If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
 * If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.
 */
class List {
    public static void getResult() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String line = scanner.next();
            if (line.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            }
            if (line.equals("Delete")) {
                int x = scanner.nextInt();
                list.remove(x);
            }
        }
        scanner.close();
        for (Integer aList : list) {
            System.out.print(aList + " ");
        }
    }
}
