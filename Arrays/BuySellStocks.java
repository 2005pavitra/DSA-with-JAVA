package Arrays;

public class BuySellStocks {
    public static int trade(int[] arr){
        int n = arr.length;

        int min = arr[0];
        int maxProfit = 0;

        for(int i = 0; i<n; i++){
            int cost = arr[i] - min;
            maxProfit = Math.max(maxProfit,cost );
            min = Math.min(min,arr[i]);
        }

return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(trade(arr));
    }
}
