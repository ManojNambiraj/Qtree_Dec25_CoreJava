package org.example.Collections;

import java.util.*;

public class MyList {
    static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//
//        names.add("Ravi");
//        names.add("Raj");
//        names.add("Sam");
//
//        System.out.println(names);
//
//        System.out.println(names.remove("Ravi"));
//
//        System.out.println(names);

//        Set<Integer> s = new HashSet<>();
//
//        s.add(10);
//        s.add(20);
//        s.add(30);
//        s.add(4400);
//
//        System.out.println(s);

        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Java");
        m.put(2, "Python");

        System.out.println(m);
        System.out.println(m.get(1));
    }
}
