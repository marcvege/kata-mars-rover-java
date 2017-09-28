public class Grid {
    private Position position = new Position();
    private int maxY = 10;
    private int maxX = 10;

    public void moveTo(CardinalPoint direction) {
        switch(direction){
            case NORTH:
                position.incrementYMod(maxY);
                break;
            case EAST:
                position.incrementXMod(maxX);
                break;
            case SOUTH:
                position.decrementYMod(maxY);
                break;
            case WEST:
                position.decrementXMod(maxX);
                break;
        }
    }

    public Position getPosition() {
        return position;
    }

}
