package homework01;

public class Square extends Rectangle {
    private final double side;
    public Square(double side) {
        // я бы оставил тут только эту строчку, но так как в задании написано переопределить, то сделал так
        super(side, side);

        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
