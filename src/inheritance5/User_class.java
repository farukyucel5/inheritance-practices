package inheritance5;

import java.util.ArrayList;
import java.util.Scanner;

public class User_class {
    public static void main(String[] args) {
        ArrayList<Integer> int_list=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter in 5 numbers: ");

        try {
            while (int_list.size()<5)
            {
                int_list.add(scan.nextInt());
            }
        } catch (Exception e) {
            System.out.println("you must pass in an integer value");
            Scanner scan1=new Scanner(System.in);
           while (int_list.size()<5)
           {
               int_list.add(scan1.nextInt());
           }
        }

        B_array_list list=new B_array_list(int_list);
    }
}
