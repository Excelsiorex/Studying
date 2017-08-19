package parametrization.random_list;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> list = new ArrayList<>();
    private Random random = new Random(System.currentTimeMillis());

    void add(T item) {
        list.add(item);
    }

    T get() {
        return list.get(random.nextInt(list.size()));
    }

    int size() {
        return list.size();
    }
}
