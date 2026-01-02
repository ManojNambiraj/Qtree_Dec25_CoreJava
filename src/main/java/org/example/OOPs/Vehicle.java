package org.example.OOPs;

interface Vehicle {
    void start();
    void speed();
}

interface Engine{
    void oil();
}

class Car implements Vehicle, Engine{
    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    @Override
    public void speed() {
        System.out.println("Car Speed is 380");
    }

    @Override
    public void oil() {

    }
}

class Bike extends Car{
    @Override
    public void start() {
        System.out.println("Bike is Starting");
    }

    @Override
    public void speed() {
        System.out.println("Bike Speed is 210");
    }
}

class Main{
    static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.speed();
        b.speed();
    }
}