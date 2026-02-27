package Substrings;

/*
Topic: Remove last character
*/

public class RemoveLastCharacter {
    public static void main(String[] args) {

        // Using String
        String s = "hello";
        s = s.substring(0, s.length() - 1);
        System.out.println(s); // hell

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("hello");
        sb.setLength(sb.length() - 1);
        System.out.println(sb); // hell
    }
}
