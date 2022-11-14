package inheritance2;

public class Line {
     private double length=1;
     Line(double length)
     {
         this.length=length;
     }

    protected double getLength() {
        return length;
    }
}
