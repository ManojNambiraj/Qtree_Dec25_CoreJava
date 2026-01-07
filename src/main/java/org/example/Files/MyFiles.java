package org.example.Files;

import java.io.*;

public class MyFiles {
    static void main(String[] args) throws IOException {
//        File file = new File("Demo.txt");
//
//        if(file.createNewFile()){
//            System.out.println("File created");
//        }else{
//            System.out.println("File Already Exist");
//        }

//        FileWriter writer = new FileWriter("Demo.txt", true);
//
//        writer.write("Hi, ");
//        writer.write("How are you?");
//
//        writer.close();
//
//        System.out.println("Data Written done...!");

        FileReader fr = new FileReader("Demo.txt");
        BufferedReader br = new BufferedReader(fr);

        String Line;

//        while((Line = br.readLine()) != null) {
//            System.out.println(Line);
//        }

        System.out.println(br.readLine());

        br.close();


    }
}
