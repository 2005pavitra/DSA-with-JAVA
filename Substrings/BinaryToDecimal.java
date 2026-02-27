package Substrings;

/*
Topic: Binary to Decimal
Formula:
result = result * 2 + bit
*/

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1011";
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }

        System.out.println(decimal); // 11
    }
}