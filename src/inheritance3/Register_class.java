package inheritance3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Register_class{
    Random random_date=new Random();



      public List<String> register() {


          Scanner scan=new Scanner(System.in);
          String name="";
          List<String> names=new ArrayList<>();
          List<LocalDate> dates=new ArrayList<>();
          int count=0;

          while (count<10)
          {

              System.out.println("pleae pass in the username");
              name=scan.next();
              int year=random_date.nextInt(10)+2013;
              int month=random_date.nextInt(12)+1;
              int day=random_date.nextInt(28)+1;

              User_class user=new User_class(name,year,month,day);


              if (day<=10)
              {
                  names.add(name);
              }

              count++;
          }



          return names;

      }

}
