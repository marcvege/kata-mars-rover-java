public class Rover {
    private char direction = 'N';

    public String move(String commands) {
        for (char command : commands.toCharArray()) {
            switch (direction) {
                case 'N':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'S';
                    break;
                case 'S':
                    direction = 'W';
                    break;

            }
        }
        return "0:0:" + direction;
    }
}
