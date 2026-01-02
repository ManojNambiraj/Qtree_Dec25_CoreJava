package org.example.OOPs;

// Types of Inheritance

// 1. Single Inheritance
// 2. Multi-Level Inheritance
// 3. Hierarchical Inheritance

class GrandFather{
    String gender = "M";

    public void behaviour(){
        System.out.println("My Behaviour is Always Smiling");
    }
}

class Father extends GrandFather{

}

class Anty extends GrandFather{

}

public class TypesInher {
    static void main(String[] args) {
        Anty a = new Anty();

        a.behaviour();

        Father f = new Father();

        f.behaviour();
    }
}
