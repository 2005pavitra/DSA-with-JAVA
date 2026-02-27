package Substrings;

/*
Topic: Substring Basics

Java syntax:
substring(start, end)
- start → inclusive
- end → exclusive
Length = end - start
*/

public class SubstringBasics {
    public static void main(String[] args) {
        String s = "helloworld";

        int i = 2;
        int p = 4;

        // substring of length p from index i
        String sub = s.substring(i, i + p);

        System.out.println(sub); // llow
    }
}

/*
Example:
Index: 0 1 2 3 4 5 6 7 8 9
       h e l l o w o r l d

substring(2, 6) → llow

Important:
i + p <= s.length()
*/