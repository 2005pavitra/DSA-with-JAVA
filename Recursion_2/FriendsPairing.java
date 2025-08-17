package Recursion_2;

public class FriendsPairing {
    public static int friends(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int fnm1 = friends(n-1);
        int fnm2 = friends(n-2);

        return fnm1 + (n-1)* fnm2;
    }

    public static void main(String[] args) {
        System.out.println(friends(3));
    }
}
