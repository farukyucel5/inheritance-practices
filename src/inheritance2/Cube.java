package inheritance2;

public class Cube extends Square{
    Cube(double length) {
        super(length);
    }
    public double getPerimeter()
    {
        return 12*getLength();
    }
    protected double getArea() {
        return 6*super.getArea();
    }

    final double volume() {
        return Math.pow(getLength(),3);
    }
}
