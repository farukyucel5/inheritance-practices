package inheritance3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_Register_class {
    public List<String> register() {


          Scanner scan=new Scanner(System.in);
          String name="";
          List<String> names=new ArrayList<>();
          int count=1;

          while (count<=5) {

              count++;
              System.out.println("Please enter in the username:");
              name=scan.nextLine();
              A_User_class ad=new A_User_class(name);
              names.add(ad.name);

          }
          return names;
      }

}
