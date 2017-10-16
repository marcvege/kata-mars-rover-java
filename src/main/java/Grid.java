import java.util.List;

public class Grid {
    private static final int MAX_X = 10;
    private static final int MAX_Y = 10;
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
        switch (situation.getDirection()) {
            case NORTH:
                return position.decrementYMod(MAX_Y);
            case EAST:
                return position.decrementXMod(MAX_X);
            case SOUTH:
                return position.incrementYMod(MAX_Y);
            case WEST:
                return position.incrementXMod(MAX_X);
        }
        return position;
    }

    private Position searchNewPositionForward(Situation situation) {
        Position position = situation.getPosition();
        switch (situation.getDirection()) {
            case NORTH:
                return position.incrementYMod(MAX_Y);
            case EAST:
                return position.incrementXMod(MAX_X);
            case SOUTH:
                return position.decrementYMod(MAX_Y);
            case WEST:
                return position.decrementXMod(MAX_X);
        }
        return position;
    }
}