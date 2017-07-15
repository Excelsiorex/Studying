package inheritance;


class Main {
    public static void main(String[] args) {
        // Наследование + общая перегрузка для базового класса и производного
        White white = new White();
        white.out('s');
        white.out(1);
    }
}