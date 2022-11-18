package inheritance5;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class Array {
    /*
  (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.
     */

    protected void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                  int x=list.get(i);
                  list.set(i, list.get(j));
                  list.set(j,x);
                }
            }
        }

        System.out.println(list);

    }
}
