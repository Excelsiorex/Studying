package interfaces;


class VeryBadSuperKiller implements SuperKiller {

    @Override
    public void drinkBlood() {
        System.out.println(getClass().getSimpleName() + ": drink blood");
    }

    @Override
    public void menace() {
        System.out.println(getClass().getSimpleName() + ": menace");
    }

    @Override
    public void kill() {
        System.out.println(getClass().getSimpleName() + ": kill");
    }

    @Override
    public void rip() {
        System.out.println(getClass().getSimpleName() + ": RIP");
    }
}
