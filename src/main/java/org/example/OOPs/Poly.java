package org.example.OOPs;

public class Poly {
    public void min(){
        System.out.println("The Zero is the min value");
    }

    public void min(int a, int b){
        if(a < b){
            System.out.println("The a is the min value");
        }else {
            System.out.println("The b is the min value");
        }
    }

    public void min(int a, int b, int c){
        if(a < b){
            System.out.println("The a is the min value");
        }else if(c < b) {
            System.out.println("The c is the min value");
        }else{
            System.out.println("The b is the min value");
        }
    }

    static void main(String[] args) {
        Poly poly = new Poly();

        poly.min();
        poly.min(5, 7);
        poly.min(8, 5, 2);
    }
}
