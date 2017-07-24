package collection_framework;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * [Set]
 * In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia).
 * {1,2,3} is an example of a set, but {1,2,2} is not a set. Needed to solve this problem.
 * [BitSet]
 * Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations.
 * After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
 */
class Sets {
    static void getSetResult() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        s.close();

        Set<String> set = new HashSet<>(t);
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }

    static void getBitSetResult() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ops = sc.nextInt();

        BitSet[] bitSet = new BitSet[]{new BitSet(size), new BitSet(size)};

        for (int i = 0; i < ops; i++) {
            String toDo = sc.next();
            int f = sc.nextInt();
            int s = sc.nextInt();

            if (toDo.equals("AND")) {
                bitSet[f - 1].and(bitSet[s - 1]);
            } else if (toDo.equals("OR")) {
                bitSet[f - 1].or(bitSet[s - 1]);
            } else if (toDo.equals("XOR")) {
                bitSet[f - 1].xor(bitSet[s - 1]);
            } else if (toDo.equals("FLIP")) {
                bitSet[f - 1].flip(s);
            } else if (toDo.equals("SET")) {
                bitSet[f - 1].set(s);
            }
            System.out.println(bitSet[0].cardinality() + " " + bitSet[1].cardinality());
        }
        sc.close();
    }
}
