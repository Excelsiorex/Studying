package inner_classes;


class Main {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;
        char a;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }

        public void setA() {
            Character.valueOf(a);
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Main p = new Main();
        p.ship("Tasmania");
        Main q = new Main();
        // Defining references to inner classes:
        Main.Contents c = q.contents();
        Main.Destination d = q.to("Borneo");
    }
}
