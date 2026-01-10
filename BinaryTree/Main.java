package BinaryTree;

public class Main {
    public static void main(String[] args) {
        String s = "sea" ;// The character you want to check
        int sum = 0;

        for(int i = 0; i< s.length(); i++){
            int asciiValue = s.charAt(i);
            sum+= asciiValue;

        }
        // Implicitly cast the char to an int

//        System.out.println("The ASCII value of " + character + " is: " + asciiValue);
        System.out.println(sum);
    }
}
