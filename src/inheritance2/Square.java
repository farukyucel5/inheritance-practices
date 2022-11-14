package inheritance2;

public class Square extends Line{

    Square(double length) {
        super(length);
    }


    protected double getArea()
    {
        return Math.pow(getLength(), 2);
    }

    protected double getPerimeter()
    {
        return 4*getLength();
    }


}
