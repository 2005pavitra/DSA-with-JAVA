package Strings;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = sc.nextLine();//takes full line including spaces
        String first = sc.next();      // input: Hello World → stores only "Hello"
        String str = "Pavitra Pandey";
        int length = str.length();

        String s1 = "Hello";
        String s2 = "World";
        String combined = s1.concat(" hey").concat(s2);

        System.out.println(combined);



        System.out.println("Hello "+name+"!");
        System.out.println("Length of the String is: "+length);

    }
}
