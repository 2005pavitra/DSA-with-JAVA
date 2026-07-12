package Problems_Practice;

public class Factorial {
    public static int fac(int n){
        if(n == 1) return 1;
        int x = n*fac(n-1);

        return x;
    }

    public static void main(String[] args){
        System.out.println(fac(6));
    }
}
