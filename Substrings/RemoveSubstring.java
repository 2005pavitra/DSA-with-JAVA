package Substrings;

/*
Topic: Remove substring of length p from index i
Logic: prefix + suffix
*/

public class RemoveSubstring {
    public static void main(String[] args) {
        String s = "helloworld";
        int i = 2;
        int p = 4;

        s = s.substring(0, i) + s.substring(i + p);

        System.out.println(s); // heorld
    }
}

/*
Explanation:
substring(0,2) = "he"
substring(6)   = "orld"
Result = "heorld"
*/