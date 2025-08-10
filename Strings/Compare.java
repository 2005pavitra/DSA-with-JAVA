package Strings;

public class Compare {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");


        if(s1 == s2){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }

        if(s1 == s3){//reference check
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }

        if(s1.equals(s3)){//checks the content(value)
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
