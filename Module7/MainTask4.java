package Module7;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainTask4 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        LinkedList<String> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();


        long start = System.currentTimeMillis();

             for(int i = 0 ; i < 1000; i ++) {
                 list.add("Hello!");}

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);

        System.out.println("=======================================================================");


        long start1 = System.currentTimeMillis();

        for(int i = 0 ; i < 10000; i ++) {
            list1.add(20);}

        long finish1 = System.currentTimeMillis();

        System.out.println(finish1 - start1);
        System.out.println("=======================================================================");


        long start2 = System.currentTimeMillis();

        for(int i = 0 ; i < 1000; i ++) {
            list2.add("Hello!");}

        long finish2 = System.currentTimeMillis();

        System.out.println(finish2 - start2);
        System.out.println("=======================================================================");


        long start3 = System.currentTimeMillis();

        for(int i = 0 ; i < 10000; i ++) {
            list3.add(20);}

        long finish3 = System.currentTimeMillis();

        System.out.println(finish3 - start3);
    }
}
