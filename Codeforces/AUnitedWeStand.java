import java.util.*;

public class AUnitedWeStand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i< n; i++){
                arr[i] = sc.nextInt();

            }
            

            Arrays.sort(arr);
            if(arr[0] == arr[n-1]){
                System.out.println("-1");
            }else{
                int maxIdx = n-1;
                while(maxIdx>0 && arr[maxIdx] == arr[n-1]){
                    maxIdx--;
                }
                System.out.print(maxIdx+ " ");
                System.out.print(n-maxIdx);
                System.out.println();
                for(int i = 0; i< maxIdx; i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
                for(int i = maxIdx ; i< n; i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }

            

        }
    }
}