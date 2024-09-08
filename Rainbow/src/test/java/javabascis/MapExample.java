package javabascis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(45454,"learn");
        m.put(4223,"more");
        System.out.println(m);

        System.out.println( m.get(4223));

        Map<List, List> m1 = new HashMap<List, List>();

    }

}
