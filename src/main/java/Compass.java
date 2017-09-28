public class Compass {
    private int numberRotationsToRight;
    private CardinalPoint[] directions =
            {CardinalPoint.NORTH,
             CardinalPoint.EAST,
             CardinalPoint.SOUTH,
             CardinalPoint.WEST};

    public Compass() {
        this.numberRotationsToRight = 0;
    }

    public CardinalPoint getDirection() {
        return directions[indexOfRotations()];
    }

    void rotateToRight() {
        numberRotationsToRight++;
    }

    void rotateToLeft() {
        numberRotationsToRight--;
    }

    private int indexOfRotations() {
        return Math.modOf(numberRotationsToRight, directions.length);
    }

}
