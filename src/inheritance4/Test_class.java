package inheritance4;

import java.util.Scanner;

public class Test_class {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter in three sides of the triangle you'd like to create");
        double side1= scan.nextDouble();
        double side2= scan.nextDouble();
        double side3=scan.nextDouble();
        System.out.println("Now enter in the color you'd like to specify for the triangle");
        String color=scan.next();
        System.out.println("is it filled if yes ,say true or say false ");
        boolean filled=scan.nextBoolean();

        Triangle triangle1=new Triangle(side1,side2,side3);
        triangle1.setColor(color);
        triangle1.setFilled(filled);

        System.out.println(triangle1);

    }
}
