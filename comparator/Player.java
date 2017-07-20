package comparator;

class Player {
    private String name;
    private int score;

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
