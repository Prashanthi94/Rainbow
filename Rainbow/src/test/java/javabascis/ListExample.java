package javabascis;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

//        List<Integer> l = new ArrayList<Integer>();
//
//        l.add(34);
//        l.add(56);
//
//        System.out.println(l);
//
//        l.add(100);
//
//        System.out.println(l);
//
//        System.out.println(l.get(1));
//
//        l.add(56);
//
//        System.out.println(l);
//
//        List <String> l1 = new ArrayList<String>();
//
//        l1.add("learn");
//        l1.add("more");
//
//        System.out.println(l1);


        List <String> h = new ArrayList<String>();
        h.add("56a");
        h.add("67b");
        h.add("78");
        h.add(1,"aa");

        System.out.println(h);


        for(String hh:h){
            System.out.println(hh);
        }




    }


}
