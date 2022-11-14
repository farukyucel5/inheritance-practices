package inheritance1;

public class Cylinder extends Circle{
    private double length=1;



    Cylinder(double radius,double length) {
        super(radius);
        this.length=length;
    }

    public double getArea()
    {
        return Math.PI*getRadius()*getRadius()*length;
    }

    public double getsurface_area()
    {

        return 2*Math.PI*getRadius()*length+2*super.getArea();
    }

    public static void main(String[] args) {
        Cylinder c1=new Cylinder(2,8);

       double c_volume= c1.getArea();
        System.out.println("The volume of the cylinder: "+c_volume);

        double c_area=c1.getsurface_area();
        System.out.println("The surface area of the cylinder: "+c_area);
    }
}
