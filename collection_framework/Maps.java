package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
 * The first line will have an integer n denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
 * After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
 */
class Maps {
    static void getResult() {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            phoneBook.put(key, value);
        }
        for (int i = 0; i < n; i++) {
            String request = scanner.nextLine();
            String result = phoneBook.get(request);
            if (result == null) {
                System.out.println("Not found");
            } else {
                System.out.println(request + "=" + result);
            }
        }
    }
}