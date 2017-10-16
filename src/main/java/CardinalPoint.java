public enum CardinalPoint {
    NORTH("N",new Position(0,1), new Position(0, -1)),
    WEST("W", new Position(-1, 0), new Position(1,0)),
    SOUTH("S", new Position(0,-1), new Position(0,1)),
    EAST("E", new Position(1,0), new Position(-1,0));

    private String symbol;
    private Position incrementForward;
    private Position incrementBack;

    CardinalPoint(String symbol, Position incrementForward, Position incrementBack) {
        this.symbol = symbol;
        this.incrementForward = incrementForward;
        this.incrementBack = incrementBack;
    }

    public String getSymbol() {
        return symbol;
    }

    public Position getIncrementForward() {
        return incrementForward;
    }

    public Position getIncrementBack() {
        return incrementBack;
    }
}
