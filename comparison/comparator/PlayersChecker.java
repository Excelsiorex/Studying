package comparison.comparator;

import java.util.Comparator;

class PlayersChecker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getScore() > o2.getScore()) {
            return -1;
        } else if (o1.getScore() < o2.getScore()) {
            return 1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
