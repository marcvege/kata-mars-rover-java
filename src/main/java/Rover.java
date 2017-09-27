public class Rover {
    private char direction = 'N';

    public String move(String commands) {
        for (char command : commands.toCharArray()) {
            if('R' == command) {
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
                    case 'W':
                        direction = 'N';
                        break;
                }
            }else if('L' == command){
                switch (direction) {
                    case 'N':
                        direction = 'W';
                        break;
                    case 'E':
                        direction = 'N';
                        break;
                    case 'S':
                        direction = 'E';
                        break;
                    case 'W':
                        direction = 'S';
                        break;
                }
            }
        }
        return "0:0:" + direction;
    }
}
