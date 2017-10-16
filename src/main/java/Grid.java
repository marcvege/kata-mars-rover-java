import java.util.List;

public class Grid {
    private static final int MAX_X = 10;
    private static final int MAX_Y = 10;
    private static final Position MAX_POSITION = new Position(MAX_X, MAX_Y);
    private List<Position> obstacles;

    public Grid(List<Position> obstacles) {
        this.obstacles = obstacles;
    }

    public Position moveAheadFrom(Situation situation) {
        return addIncrementToPosition(situation.getPosition(), situation.getDirection().getIncrementForward());
    }

    public Position moveBackFrom(Situation situation) {
        return addIncrementToPosition(situation.getPosition(), situation.getDirection().getIncrementBack());
    }

    private Position addIncrementToPosition(Position position, Position increment) {
        Position newPosition = position.incrementPositionMod(increment, MAX_POSITION);
        if (obstacles.contains(newPosition)) {
            return Position.createBlockedPosition(position);
        }
        return newPosition;
    }
}