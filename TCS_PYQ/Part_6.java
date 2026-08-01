package TCS_PYQ;

public class Part_6 {
    public static void main(String[] args){
        int[] arr = {1, 0,0,0, 1};
        int n = 2;
        solve(arr ,n);
    }

    private static void solve(int[] arr, int n){
        int len = arr.length;
        int cnt = 0;

        int i = 0;
        while( i< len){
            if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 0){
                if((i ==0 || arr[i-1] == 0 ) && (i == len-1 || arr[i+1] == 0)){
                    arr[i] = 1;
                    cnt++;
                }
                i++;
            }
        }

        if(cnt>= n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
