package parametrization.anonymous_inner_generator;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class BankTeller {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        // Filling
        Queue<Customer> line = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            line.add(Customer.customer.next());
        }
        List<Teller> tellers = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            tellers.add(Teller.generator.next());
        }

        // Using
        for (Customer c : line) {
            serve(tellers.get(random.nextInt(tellers.size())), c);
        }
    }

    private static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }
}
