public class Position {
    private int y;
    private int x;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void incrementYMod(int mod) {
        y = Math.modOf(++y, mod);
    }

    public void incrementXMod(int mod) {
        x = Math.modOf(++x, mod);
    }

    public void decrementYMod(int mod) {
        y = Math.modOf(--y, mod);
    }

    public void decrementXMod(int mod) {
        x = Math.modOf(--x, mod);
    }
}
