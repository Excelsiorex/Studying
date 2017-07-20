package comparator;

import java.util.ArrayList;

/**
 * Comparator realization
 */
class Main {
    public static void main(String[] args) {
        Product apple = new Product(50, "Apple");
        Product banana = new Product(40, "Banana");
        Product lemon = new Product(45, "Lemon");

        ArrayList<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(banana);
        products.add(lemon);

        products.sort(new ComparatorExample());
        for (Product p : products) {
            System.out.println(p.getName());
        }
    }
}
