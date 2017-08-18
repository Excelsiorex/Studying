package rtti.class_example;

public class Main {
    public static void main(String[] args) {
        System.out.println("START OF THE PROGRAM");
        new Candy();
        System.out.println("Class Candy after loading.");
        try {
            Class.forName("rtti.class_example.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Gum not found.");
        }
        System.out.println("Class Gum after loading (Class.forName(...)).");
        new Cookie();
        System.out.println("Class Cookie after loading.");
        System.out.println("END OF THE PROGRAM");
    }
}

