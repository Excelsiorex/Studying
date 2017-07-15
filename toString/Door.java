package toString;


class Door {
    private String s;

    Door() {
        System.out.println("Constructor runs!");
        s = "String!";
    }

    @Override
    public String toString() {
        return s;
    }
}
