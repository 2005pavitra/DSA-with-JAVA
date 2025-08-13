package Recursion;

public class DecIncNumbers {
    public static void decrease(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        decrease(n-1);
    }

    public static void increase(int n){
        if(n==0){
            return;
        }
        increase(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n = 10;
        decrease(n);
        System.out.println();
        increase(10);
    }
}
