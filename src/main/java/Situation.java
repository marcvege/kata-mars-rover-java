public class Situation {
    private Position position;
    private CardinalPoint direction;

    public Situation(Position position, CardinalPoint direction) {
        this.position = position;
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }

    public CardinalPoint getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoint direction) {
        this.direction = direction;
    }

    public String getRepresentation() {
        return String.format("%s:%s:%s", position.getX(), position.getY(), direction.getSymbol());
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
