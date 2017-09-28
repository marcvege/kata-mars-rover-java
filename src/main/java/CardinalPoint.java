public enum CardinalPoint {
    NORTH("N"), WEST("W"), SOUTH("S"), EAST("E");

    private String symbol;

    CardinalPoint(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
