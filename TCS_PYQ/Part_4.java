package TCS_PYQ;

public class Part_4 {
    public static void main(String[] args){
        int[] E = {7,0,5,1,3};
        int[] L = {1,2,1,3,4};

        System.out.println(solve(E,L));
    }

    private static int solve(int[] E, int[] L){
        int max = 0;
        int guests = 0;

        for(int i = 0; i< E.length;i++){
             guests = guests + E[i]-L[i]; //curr = curr+change
            max = Math.max(guests, max);
        }

        return max;
    }
}
