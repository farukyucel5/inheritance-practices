package inheritance1;

public class Circle {

         private double radius=1;

    public Circle(double radius) {

        this.radius = radius;
         }

          public double getRadius() {

           return radius;
         }

         public double getArea() {
             return radius * radius * Math.PI;
         }
}
