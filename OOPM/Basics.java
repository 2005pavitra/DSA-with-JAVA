package OOPM;

public class Basics {
    public static void main(String[] args) {
//        Student S1 = new Student();
//        System.out.println(S1.name);
//        System.out.println(S1.rno);
//        System.out.println(S1.marks);
//        S1.greet();

//        Student S2 = new Student();
//        S2.name = "Rahul";
//        S2.greet();

        Student S3 = new Student("Aman", 12, 80f);
        System.out.println(S3.name);
        System.out.println(S3.rno);
        System.out.println(S3.marks);

        Student S4 = new Student();
        S4.name = "S4";
        Student S5 = S4;
        System.out.println(S5.name);

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

//    Student(String name, int rno, float marks){
//        this.name = name;
//        this.rno = rno;
//        this.marks = marks;
//    }

    Student(String fname, int rollno, float percentage){
        name = fname;
        rno = rollno;
        marks = percentage;
    }
}