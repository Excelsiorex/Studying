package comparison.comparator;

import java.util.Comparator;

class ComparatorExample implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        int o1_count = o1.getCount();
        int o2_count = o2.getCount();

        if (o1_count > o2_count) {
            return 1;
        } else if (o1_count < o2_count) {
            return -1;
        } else {
            return 0;
        }
    }
}
