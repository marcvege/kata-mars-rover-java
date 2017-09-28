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

    public Position incrementYMod(int mod) {
        return new Position (x, Math.modOf(y+1, mod));
    }

    public Position incrementXMod(int mod) {
        return new Position (Math.modOf(x + 1, mod), y);
    }

    public Position decrementYMod(int mod) {
        return new Position (x, Math.modOf(y-1, mod));
    }

    public Position decrementXMod(int mod) {
        return new Position( Math.modOf(x-1, mod), y);
    }
}
