public class Rover {
    public static final char ROTATE_TO_RIGHT = 'R';
    public static final char ROTATE_TO_LEFT = 'L';

    private Compass compass = new Compass();

    public String move(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case ROTATE_TO_RIGHT:
                    compass.rotateToRight();
                    break;
                case ROTATE_TO_LEFT:
                    compass.rotateToLeft();
                    break;
            }
        }
        return "0:0:" + compass.getCurrentDirection();
    }

}
