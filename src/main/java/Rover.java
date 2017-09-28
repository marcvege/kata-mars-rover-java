public class Rover {
    public static final char ROTATE_TO_RIGHT = 'R';
    public static final char ROTATE_TO_LEFT = 'L';
    public static final char MOVE_FORWARD = 'M';

    private Compass compass ;
    private final Situation situation;

    public Rover() {
        this.compass = new Compass();
        situation = new Situation(new Position(0,0), CardinalPoint.NORTH);
    }

    public String move(String commands, Grid grid) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case ROTATE_TO_RIGHT:
                    situation.setDirection(compass.rotateToRight());
                    break;
                case ROTATE_TO_LEFT:
                    situation.setDirection(compass.rotateToLeft());
                    break;
                case MOVE_FORWARD:
                    situation.setPosition(grid.moveTo(situation));
                    break;
            }
        }
        //return Either.right(grid.getPosition());
        return situation.getRepresentation();
    }
}
