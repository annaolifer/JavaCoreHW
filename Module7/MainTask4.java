package Module7;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainTask4 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(1000);
        ArrayList<String> list2 = new ArrayList<>(10000);
        LinkedList<Integer> list3 = new LinkedList<>();
        LinkedList<String> list4 = new LinkedList<>();

        list1.add(2,100);
        list2.add(2, "Sun");
        list3.add(2,100);
        list4.add(2,"Rain");

        list1.set(5,34);
        list2.set(3,"Moon");
        list3.set(3,13);
        list4.set(1,"Life");

        list1.get(23);
        list2.get(25);
        list3.get(30);
        list4.get(45);

        list1.remove(27);
        list2.remove(26);
        list3.remove(38);
        list4.remove(49);




    }
}
