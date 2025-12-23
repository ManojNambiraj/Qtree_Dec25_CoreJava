package org.example.OOPs;

public class Recursion {

    static void main(String[] args) {
        nums(10);
    }

    static void nums(int n){

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

//        if(n == 1){
//            System.out.println(n);
//        }else{
//            System.out.println(n);
//            nums(n - 1);
//        }
    }
}
