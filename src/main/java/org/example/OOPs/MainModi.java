package org.example.OOPs;

public class MainModi {
    static void main(String[] args) {
        Encapsule en = new Encapsule();

        en.setName("Kavi");
        System.out.println(en.getName());

        en.setAge(20);
        System.out.println(en.getAge());

        en.setDept("IT");
        System.out.println(en.getDept());
    }
}
