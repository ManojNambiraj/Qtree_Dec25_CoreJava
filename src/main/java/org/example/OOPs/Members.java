package org.example.OOPs;

public class Members {
    String name;
    int rollno;
    String dept;
    int passedOut;

    Members(String n, int r, String d){
        this.name = n;
        this.rollno = r;
        this.dept = d;
    }

    Members(String n, int r, String d, int p){
        this.name = n;
        this.rollno = r;
        this.dept = d;
        this.passedOut = p;
    }

    public void display(){
        System.out.println(name + " " + rollno + " " + dept);
    }

    public void passedoutStudentYear(){
        System.out.println(name + " " + rollno + " " + dept + " " + passedOut);
    }
}
