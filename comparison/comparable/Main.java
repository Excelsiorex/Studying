package comparison.comparable;

/**
 * Comparable realization
 */
class Main {
    public static void main(String[] args) {
        ComparableExample example = new ComparableExample(299, 123);
        ComparableExample example2 = new ComparableExample(300, 123);
        ComparableExample example3 = new ComparableExample(300, 123);

        if (example.compareTo(example2) > 0) {
            System.out.println("Comparison of 'example' and 'example2': 'example' > 'example2'.");
        } else if (example.compareTo(example2) < 0) {
            System.out.println("Comparison of 'example' and 'example2': 'example' < 'example2'.");
        } else {
            System.out.println("Comparison of 'example' and 'example2': 'example' == 'example2'.");
        }

        if (example.compareTo(example3) > 0) {
            System.out.println("Comparison of 'example' and 'example3': 'example' > 'example3'.");
        } else if (example.compareTo(example3) < 0) {
            System.out.println("Comparison of 'example' and 'example3': 'example' < 'example3'.");
        } else {
            System.out.println("Comparison of 'example' and 'example3': 'example' == 'example3'.");
        }

        if (example2.compareTo(example3) > 0) {
            System.out.println("Comparison of 'example2' and 'example3': 'example2' > 'example3'.");
        } else if (example2.compareTo(example3) < 0) {
            System.out.println("Comparison of 'example2' and 'example3': 'example2' < 'example3'.");
        } else {
            System.out.println("Comparison of 'example2' and 'example3': 'example2' == 'example3'.");
        }
    }
}
