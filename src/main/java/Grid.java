import java.util.List;

public class Grid {
    private static final int MAX_X = 10;
    private static final int MAX_Y = 10;
    private List<Position> obstacles;

    public Grid(List<Position> obstacles) {
        this.obstacles = obstacles;
    }

    public Position moveTo(Situation situation) {
        Position position = situation.getPosition();
        switch(situation.getDirection()){
            case NORTH:
                position.incrementYMod(MAX_Y);
                break;
            case EAST:
                position.incrementXMod(MAX_X);
                break;
            case SOUTH:
                position.decrementYMod(MAX_Y);
                break;
            case WEST:
                position.decrementXMod(MAX_X);
                break;
        }
        return position;
    }
}
