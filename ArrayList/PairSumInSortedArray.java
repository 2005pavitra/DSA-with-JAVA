package ArrayList;

import java.util.ArrayList;

public class PairSumInSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(221);
        list.add(231);
        list.add(565);
        list.add(3421);

        int target = 233;
        System.out.println(find(list, target));
    }

    public static boolean find(ArrayList<Integer> list, int target){

        int start = 0;
        int end = list.size()-1;

        while(start< end){
            int sum = list.get(start)+list.get(end);
            if(sum == target){
                return true;
            } else if (sum<target) {
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
}
