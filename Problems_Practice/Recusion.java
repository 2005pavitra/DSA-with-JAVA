package Problems_Practice;

public class Recusion {
    public static void main(String[] args){
        int n = 5;
        solve(n);
    }

    private static void solve(int n){
        if(n == 0){
            return ;
        }

         solve(n-1);
        System.out.println(n);
    }
}

/**
 * public class Main
 * {
 * 	public static void main(String[] args) {
 * 		int[] arr = {3, 4, 5, 8, 2};
 * 		System.out.println(sum(arr, 0));
 * 	    }
 *
 * 	private static int sum(int[] arr, int i){
 *
 * 	    int n= arr.length;
 * 	    if( i == n ){
 * 	        return 0;
 *        }
 *
 * 	    return arr[i] + sum(arr, i+1);
 *    }
 * }
 */