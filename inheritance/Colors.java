package inheritance;


class Colors {
    // Перегрузка начинается в базовом классе
    public void out() {
        System.out.println("Class `Colors` used!");
    }

    public void out(int i) {
        System.out.println("Class `Colors` used! " + i);
    }

    public void out(double i) {
        System.out.println("Class `Colors` used! " + i);
    }
}
