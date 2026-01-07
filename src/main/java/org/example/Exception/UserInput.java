package org.example.Exception;
import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = input.nextLine();

        System.out.println(name);

//        if(age > 18){
//            System.out.println("Eligible to vote");
//        }else{
//            System.out.println("Not Eligible to vote");
//        }
    }
}
