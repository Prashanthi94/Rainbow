package javabascis;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {


        Set<Integer> s = new HashSet<Integer>();
        s.add(34);
        s.add(34);
        System.out.println(s);
        s.add(99);
        s.add(34);
        System.out.println(s);
    }
}
