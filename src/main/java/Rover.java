import java.awt.*;

public class Rover {
    public static final char ROTATE_TO_RIGHT = 'R';
    public static final char ROTATE_TO_LEFT = 'L';
    public static final char MOVE_FORWARD = 'M';

    private Compass compass = new Compass();
    private Grid grid = new Grid();

    public String move(String commands) {
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

        Position position = grid.getPosition();
        return position.getX() + ":" + position.getY() + ":" + compass.getDirection();
    }

}
