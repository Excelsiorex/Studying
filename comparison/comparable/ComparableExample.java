package comparison.comparable;

class ComparableExample implements Comparable<ComparableExample> {
    private int sum;
    private int count;

    ComparableExample(int sum, int count) {
        this.sum = sum;
        this.count = count;
    }

    private int getSum() {
        return sum;
    }

    private int getCount() {
        return count;
    }

    @Override
    public int compareTo(ComparableExample o) {
        if (this.getCount() * this.getSum() > o.getCount() * o.getSum()) {
            return 1;
        } else if (this.getCount() * this.getSum() < o.getCount() * o.getSum()) {
            return -1;
        } else {
            return 0;
        }
    }
}
