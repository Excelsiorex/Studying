package parametrization.linked_stack;

public class Main {
    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        for (String s : "This is my 1000th program".split(" ")) {
            linkedStack.push(s);
        }

        String s;
        while ((s = linkedStack.pop()) != null) {
            System.out.println(s);
        }
    }
}
