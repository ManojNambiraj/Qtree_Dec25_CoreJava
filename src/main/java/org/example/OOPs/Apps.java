package org.example.OOPs;

public class Apps {
    static void main(String[] args) {
        Members s1 = new Members("Ravikumar", 102, "IT");
        Members s2 = new Members("Jeni", 103, "EEE", 2022);

        s1.display();
        s2.passedoutStudentYear();

    }
}
