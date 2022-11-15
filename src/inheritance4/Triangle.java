package inheritance4;

public class Triangle extends GeometricObject{
    double side1=1;
    double side2=1;
    double side3=1;
    String color;

    boolean filled;

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    Triangle(double side1,double side2,double side3) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getArea()
    {
        double area=super.getArea();
        if (side1>Math.abs(side2-side3)&&side2>Math.abs(side1-side3)&&side3>Math.abs(side2-side1)) {
            double u=(side1+side2+side3)/2;
             area= Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));//the formula of the area of a triangle.
        }
        else
            System.out.println("this triangle cannot be drawn!! ");

        return area;
    }

    public  double  getPerimeter() {
        double perimeter=super.getPerimeter();
        if(side1>Math.abs(side2-side3)&&side2>Math.abs(side1-side3)&&side3>Math.abs(side2-side1))
             perimeter=side1+side2+side3;

        return perimeter;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Triangle area = " + getArea() + "\nPerimeter = " + getPerimeter() +
                "\nColor = " + getColor()+"\nfilled or not: "+isFilled() ;
    }
}
