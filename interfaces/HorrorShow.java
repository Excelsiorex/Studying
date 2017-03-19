package interfaces;


public class HorrorShow {
    private static void u(Bandit b) {
        b.menace();
    }

    private static void v(Killer k) {
        k.menace();
        k.kill();

    }

    private static void w(SuperKiller s) {
        s.menace();
        s.kill();
        s.drinkBlood();
        s.rip();
    }

    public static void main(String[] args) {
        Killer killer = new Johnny();
        u(killer);
        v(killer);
        // w(killer); don't work here!
        SuperKiller superKiller = new VeryBadSuperKiller();
        u(superKiller);
        v(superKiller);
        w(superKiller); // it works!

    }
}
