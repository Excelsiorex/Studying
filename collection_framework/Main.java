package collection_framework;


import java.util.ArrayList;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Lists.getResult();

        Maps.getResult();

        Sets.getSetResult();

        Sets.getBitSetResult();

        Queues.getResult();

        arrayListTimer(10_000_000, 100, 1_000_000);

        linkedListTimer(10_000_000, 100, 1_000_000);
    }

    private static void linkedListTimer(int arraysSize, int count, int numToInsert) {

        // LinkedList time of filling
        long before = System.nanoTime();
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < arraysSize; i++) {
            integers.add(numToInsert);
        }
        long after = System.nanoTime();
        System.out.println("[LinkedList] Filling with " + arraysSize + " elements: " + ((double) (after - before) / 1000_000_000) + " sec.");

        // LinkedList time of inserting in 1 position
        long b = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.add(1, numToInsert);
        }
        long a = System.nanoTime();
        System.out.println("[LinkedList] Inserting " + count + " elements: " + ((double) (a - b) / 1000_000_000) + " sec.");

        // LinkedList time of getting
        long bb = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.get(i + 100);
        }
        long aa = System.nanoTime();
        System.out.println("[LinkedList] Getting " + count + " elements: " + ((double) (aa - bb) / 1000_000_000) + " sec.");

        // LinkedList time of setting
        long bbb = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.set(i + 100, numToInsert + 100);
        }
        long aaa = System.nanoTime();
        System.out.println("[LinkedList] Setting " + count + " elements: " + ((double) (aaa - bbb) / 1000_000_000) + " sec.");

        // LinkedList time of removing
        long bbbb = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.remove(i + 100);
        }
        long aaaa = System.nanoTime();
        System.out.println("[LinkedList] Removing " + count + " elements: " + ((double) (aaaa - bbbb) / 1000_000_000) + " sec.");
    }

    private static void arrayListTimer(int arraysSize, int count, int numToInsert) {

        // ArrayList time of filling
        long before = System.nanoTime();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arraysSize; i++) {
            integers.add(numToInsert);
        }
        long after = System.nanoTime();
        System.out.println("[ArrayList] Filling with " + arraysSize + " elements: " + ((double) (after - before) / 1000_000_000) + " sec.");

        // ArrayList time of inserting in 1 position
        long b = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.add(1, numToInsert);
        }
        long a = System.nanoTime();
        System.out.println("[ArrayList] Inserting " + count + " elements: " + ((double) (a - b) / 1000_000_000) + " sec.");

        // ArrayList time of getting
        long bb = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.get(i + 100);
        }
        long aa = System.nanoTime();
        System.out.println("[ArrayList] Getting " + count + " elements: " + ((double) (aa - bb) / 1000_000_000) + " sec.");

        // ArrayList time of setting
        long bbb = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.set(i + 100, numToInsert + 100);
        }
        long aaa = System.nanoTime();
        System.out.println("[ArrayList] Setting " + count + " elements: " + ((double) (aaa - bbb) / 1000_000_000) + " sec.");

        // ArrayList time of removing
        long bbbb = System.nanoTime();
        for (int i = 0; i < count; i++) {
            integers.remove(i + 100);
        }
        long aaaa = System.nanoTime();
        System.out.println("[ArrayList] Removing " + count + " elements: " + ((double) (aaaa - bbbb) / 1000_000_000) + " sec.");
    }
}
