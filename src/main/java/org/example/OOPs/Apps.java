package org.example.OOPs;

public class Apps {
    static void main(String[] args) {
        Members s1 = new Members();
        Members s2 = new Members();

        s1.name = "Ravi";
        s1.rollno = 102;
        s1.dept = "IT";

        s1.display();

        s2.name = "Kavitha";
        s2.rollno = 104;
        s2.dept = "EEE";

        s2.display();
    }
}
