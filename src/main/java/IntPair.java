public class IntPair {
    private final int x;
    private final int y;

    IntPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int sumXY() {
        return this.getX() + this.getY();
    }

    public int averageXY() {
        return sumXY() / 2;
    }

}
