package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Comparator realization
 */
class Main {
    public static void main(String[] args) {
        // Product example
        productExample();

        // Player example
        // Given an array of n Player objects, write a comparator that sorts them in order of decreasing score;
        // if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must
        // create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b)
        // method implementing the Comparator.compare(T o1, T o2) method.
        playerExample();
    }

    private static void playerExample() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        PlayersChecker playersChecker = new PlayersChecker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, playersChecker);
        for (Player aPlayer : player) {
            System.out.printf("%s %s\n", aPlayer.getName(), aPlayer.getScore());
        }
    }

    private static void productExample() {
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
