package org.example.Exception;

class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}

public class MyExcept {
    public static void demo(int age) throws CustomException{
        if(age > 18){
            System.out.println("Eligible");
        }else{
            throw new CustomException("Not Eligible");
        }
    }

    static void main(String[] args) {
        try{
            demo(16);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
