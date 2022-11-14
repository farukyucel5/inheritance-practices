package inheritance3;

import java.util.ArrayList;
import java.util.List;

public class Listing {

    public static List<String> printHappyUsers()
    {
        Register_class object=new Register_class();
        List<String> happy_users=new ArrayList<>();
        happy_users=object.register();
        return happy_users;

    }
    public static void main(String[] args) {

        System.out.println(printHappyUsers());

    }
}
