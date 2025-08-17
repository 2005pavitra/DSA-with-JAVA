package Recursion_1;

public class Sum {
    public static int print(int n){
        if(n == 0){
            return 0;
        }
        int res = n + print(n-1);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(print(5));
    }
}
