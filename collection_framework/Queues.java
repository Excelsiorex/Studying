package collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * You have to deal with 2 types of events: ENTER (a student enters the queue) or SERVED.
 * A unique token is assigned to any student entering the queue. The queue serves the students based on the following criteria:
 * The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 * Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 * Any students having the same CGPA and name will be served in ascending token order.
 * Given a sequence of n events, print the names of students who are yet to be served(based on above criteria). If the queue is empty, print EMPTY.
 */
class Queues {
    static void getResult() {
        PriorityQueue<Student> queue = new PriorityQueue<>(Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getToken));
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        while (totalEvents > 0) {
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                double cgpa = Double.parseDouble(in.next());
                int token = in.nextInt();

                Student student = new Student(token, name, cgpa);
                queue.add(student);
            } else if (event.equals("SERVED")) {
                if (!queue.isEmpty()) {
                    queue.remove();
                }
            }
            totalEvents--;
            if (totalEvents == 0 && queue.isEmpty()) {
                System.out.println("EMPTY");
            }
        }
        in.close();

        while (!queue.isEmpty()) {
            System.out.println(queue.poll().getFname());
        }
    }
}

class Student {
    private int token;
    private String fname;
    private double cgpa;

    Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    int getToken() {
        return token;
    }

    String getFname() {
        return fname;
    }

    double getCgpa() {
        return cgpa;
    }
}