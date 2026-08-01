package TCS_PYQ;

public class Part_8 {
    public static void main(String[] args){
        int n = 1011;
        System.out.println(binary(n));
    }

    private static int binary(int x){
        int val = 0;

        int pow = 1;
        while(x>0){
            int dig = x%10;
            val +=dig*pow;
            pow*=2;
            x= x/10;

        }
        return val;
    }
}
