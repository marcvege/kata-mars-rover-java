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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (y != position.y) return false;
        return x == position.x;
    }

    @Override
    public int hashCode() {
        int result = y;
        result = 31 * result + x;
        return result;
    }
}
