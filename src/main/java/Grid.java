import io.vavr.control.Either;

import java.util.List;
import java.util.Optional;

public class Grid {
    private static final int MAX_X = 10;
    private static final int MAX_Y = 10;
    public static final Optional<Position> OBSTACLE = Optional.empty();
    private List<Position> obstacles;

    public Grid(List<Position> obstacles) {
        this.obstacles = obstacles;
    }

    public Optional<Position> moveAheadFrom(Situation situation) {
        Position position = situation.getPosition();
        Position newPosition = position;
        switch(situation.getDirection()){
            case NORTH:
                newPosition = position.incrementYMod(MAX_Y);
                break;
            case EAST:
                newPosition = position.incrementXMod(MAX_X);
                break;
            case SOUTH:
                newPosition = position.decrementYMod(MAX_Y);
                break;
            case WEST:
                newPosition = position.decrementXMod(MAX_X);
                break;
        }
        if(obstacles.contains(newPosition)){
            return OBSTACLE;
        }
        return Optional.of(newPosition);
    }
}
