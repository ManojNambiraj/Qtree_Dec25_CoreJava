package org.example.OOPs;

public class InMain {
    static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d.isBark);
        System.out.println(d.noLegs);

        d.sound();
    }
}
