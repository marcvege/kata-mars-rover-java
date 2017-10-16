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
        Position newPosition = searchNewPositionForward(situation);
        if (obstacles.contains(newPosition)) {
            return Position.createBlockedPosition(situation.getPosition());
        }
        return newPosition;
    }

    public Position moveBackFrom(Situation situation) {
        Position newPosition = searchNewPositionBack(situation);
        if (obstacles.contains(newPosition)) {
            return Position.createBlockedPosition(situation.getPosition());
        }
        return newPosition;
    }

    private Position searchNewPositionBack(Situation situation) {
        Position position = situation.getPosition();
        return position.incrementPositionMod(situation.getDirection().getIncrementBack(), MAX_POSITION);
    }

    private Position searchNewPositionForward(Situation situation) {
        Position position = situation.getPosition();
        return position.incrementPositionMod(situation.getDirection().getIncrementForward(), MAX_POSITION);
    }
}