package tuples;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        A a = new A(random.nextInt(1000));
        B b = new B(random.nextDouble());
        C c = new C(random.nextBoolean());

        TwoTuples<A, B> twoTuplesCustom = new TwoTuples<>(a, b);
        ThreeTuples<A, B, C> threeTuplesCustom = new ThreeTuples<>(a, b, c);
        TwoTuples<Integer, String> twoTuples = new TwoTuples<>(30, "it works!");
        ThreeTuples<Integer, Double, Boolean> threeTuples = new ThreeTuples<>(50, 30.5, true);

        System.out.println("Custom types");
        System.out.println(twoTuplesCustom);
        System.out.println(threeTuplesCustom);

        System.out.println("Known types");
        System.out.println(twoTuples);
        System.out.println(threeTuples);
    }
}
