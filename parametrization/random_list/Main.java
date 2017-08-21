package parametrization.random_list;

public class Main {
    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        randomList.add("1st string");
        randomList.add("2nd string");
        randomList.add("3rd string");
        randomList.add("4th string");
        randomList.add("5th string");
        // ...

        for (int i = 0; i < randomList.size(); i++) {
            System.out.println(randomList.get());
        }
    }
}
