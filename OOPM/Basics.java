package OOPM;

public class Basics {
    public static void main(String[] args) {
        Student S1 = new Student();
        System.out.println(S1.name);
        System.out.println(S1.rno);
        System.out.println(S1.marks);
        S1.greet();

        Student S2 = new Student();
        S2.name = "Rahul";
        S2.greet();
    }

}


class Student{
    //instance variables ,properties
    String name;
    int rno;
    float marks;

    void greet(){
        System.out.println("Hello! My name is "+ name+".");
    }

    Student (){
        this.name = "Pavitra Pandey";
        this.rno = 48;
        this.marks = 90.5f;
    }
}