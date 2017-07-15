package collection_framework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia).
 * {1,2,3} is an example of a set, but {1,2,2} is not a set. Needed to solve this problem.
 */
class Sets {
    static void getResult() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>(t);
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }
}
