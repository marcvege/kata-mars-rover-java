public class Position {
    private int y;
    private int x;
    private boolean blocked;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.blocked = false;
    }

    private Position(int x, int y, boolean blocked) {
        this.x = x;
        this.y = y;
        this.blocked = blocked;
    }

    public static Position createBlockedPosition(Position position) {
        return new Position(position.x, position.y, true);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public Position incrementPositionMod(Position increment, Position maxPosition) {
        return new Position(Math.modOf(x + increment.x, maxPosition.x),
                Math.modOf(y + increment.y, maxPosition.y));
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
