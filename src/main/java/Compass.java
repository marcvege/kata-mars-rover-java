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

    CardinalPoint rotateToRight() {
        numberRotationsToRight++;
        return directions[indexOfRotations()];
    }

    CardinalPoint rotateToLeft() {
        numberRotationsToRight--;
        return directions[indexOfRotations()];
    }

    private int indexOfRotations() {
        return Math.modOf(numberRotationsToRight, directions.length);
    }

}
