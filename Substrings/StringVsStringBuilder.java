package Substrings;

/*
Topic: String vs StringBuilder
String → Immutable
StringBuilder → Mutable
*/

public class StringVsStringBuilder {
    public static void main(String[] args) {

        // String (creates new object)
        String s = "hello";
        s = s + " world";

        // StringBuilder (modifies same object)
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");

        System.out.println(sb.toString());
    }
}

/*
Use StringBuilder when:
- Multiple modifications
- Loop operations
*/