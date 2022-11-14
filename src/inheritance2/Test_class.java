package inheritance2;

import java.util.Scanner;

public class Test_class {
    public static void main(String[] args) {

        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("Please enter in a number");
            double side_length1=scan.nextDouble();
            Cube c1=new Cube(side_length1);

            System.out.println("The edge length of the cube1: "+c1.getLength());
            System.out.println("The surface area of the cube1: "+c1.getArea());
            System.out.println("The volume of the cube1"+c1.volume());
            System.out.println("The sum of the side lengths of the cube1:"+c1.getPerimeter());


        } catch (Exception e) {
            System.out.println("I wrote you enter a NUMBER!,are you blind!");
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter in a number");
        double side_length2=scan.nextDouble();

        Square c2=new Cube(side_length2);
        System.out.println("The edge length of the cube2:  "+c2.getLength());
        System.out.println("The surface area of the cube2:  "+c2.getArea());
        System.out.println("The sum of the side lengths of the cube2:  "+c2.getPerimeter());

    }
}
