package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Square color: " + getColor()
                + ", Side length = " + sideLength
                + "Area = " + area());
    }
}
