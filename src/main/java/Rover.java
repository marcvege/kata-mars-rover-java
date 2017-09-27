public class Rover {
    private Compass compass = new Compass('N');

    public String move(String commands) {
        for (char command : commands.toCharArray()) {
            if('R' == command) {
                compass.rotateToRight();
            }else if('L' == command){
                compass.rotateToLeft();
            }
        }
        return "0:0:" + compass.getDirection();
    }

}
