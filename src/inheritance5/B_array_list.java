package inheritance5;

import java.util.ArrayList;

public class B_array_list extends Array{
    ArrayList<Integer> list;
    B_array_list(ArrayList<Integer> list) {
        this.list=list;
        sort(this.list);
    }

}
