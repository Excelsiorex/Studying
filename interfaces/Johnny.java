package interfaces;


public class Johnny implements Killer {

    @Override
    public void menace() {
        System.out.println(getClass().getSimpleName() + ": menace");
    }

    @Override
    public void kill() {
        System.out.println(getClass().getSimpleName() + ": kill");
    }
}
