package inheritance3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C_Listing {

    public static void printHappyUsers()
    {
        B_Register_class object=new B_Register_class();
        Random ramdom_nums=new Random();


       List<String> all_names=object.register();
       List<String> happy_users=new ArrayList<>();
       List<LocalDate> happy_users_dates=new ArrayList<>();
        for (String each_name : all_names) {
            int year = ramdom_nums.nextInt(10)+2013;
            int month = ramdom_nums.nextInt(12)+1;
            int day = ramdom_nums.nextInt(28)+1;
            A_User_class date=new A_User_class(year,month,day);


            if (day <= 10) {
                happy_users.add(each_name);
                happy_users_dates.add(date.registration_date);
            }

        }

        System.out.println("The names of happy users: "+happy_users);
        System.out.println("And,the randomly assigned dates for these users :"+happy_users_dates);


    }
    public static void main(String[] args) {

        printHappyUsers();
    }
}
