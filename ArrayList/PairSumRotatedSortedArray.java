package ArrayList;

import java.util.ArrayList;

public class PairSumRotatedSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(231);
        list.add(565);
        list.add(3421);
        list.add(12);
        list.add(221);

        int target = 236;

        System.out.println(find(list,target));


    }
    private static boolean find(ArrayList<Integer> list, int target){
        int n = list.size();
        int pivot = -1;

        for(int i = 0; i< n - 1; i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }


        if(pivot == -1){
            pivot = n-1;
        }

        int lp = (pivot+1)%n;
        int rp = pivot;

        while(lp!=rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum == target){
                return true;
            }else if(sum > target){
                rp = (n+rp-1)%n;
            }else{
                lp = (lp+1)%n;
            }
        }
        return false;
    }
}
