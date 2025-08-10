package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter a word to check palindrome: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = str.length();

        Boolean isPalindrome = true;
        for (int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(str+" is a Palindrome");
        }else{
            System.out.println(str+" is not a Palindrome");
        }
    }
}
