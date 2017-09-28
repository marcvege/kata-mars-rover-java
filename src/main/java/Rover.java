public class Rover {
    public static final char ROTATE_TO_RIGHT = 'R';
    public static final char ROTATE_TO_LEFT = 'L';
    public static final char MOVE_FORWARD = 'M';

    private Compass compass = new Compass();

    public String move(String commands, Grid grid) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case ROTATE_TO_RIGHT:
                    compass.rotateToRight();
                    break;
                case ROTATE_TO_LEFT:
                    compass.rotateToLeft();
                    break;
                case MOVE_FORWARD:
                    grid.moveTo(compass.getDirection());
                    break;
            }
        }
        return getRepresentation(grid.getPosition(), compass.getDirection());
    }

    private String getRepresentation(Position position, CardinalPoint direction) {
        return String.format("%s:%s:%s", position.getX(), position.getY(), direction.getSymbol());
    }

}
