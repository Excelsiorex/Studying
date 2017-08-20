package parametrization.methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(gm);
        gm.f(50);
        gm.f(100.0);
        gm.f(10L);
        gm.f(10.5F);

        Set<Integer> integerSet = new HashSet<>(
                Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));
        Set<Integer> integerSet2 = new HashSet<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Union: " + gm.union(integerSet, integerSet2));
        System.out.println("Intersection: " + gm.intersection(integerSet, integerSet2));
        System.out.println("Difference: " + gm.difference(integerSet, integerSet2));
        System.out.println("Complement: " + gm.complement(integerSet, integerSet2));
    }
}
