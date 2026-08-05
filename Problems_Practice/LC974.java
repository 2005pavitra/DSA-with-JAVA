package Problems_Practice;

import java.util.HashMap;

public class LC974 {
    public static void main(String[] args){
//        int[] nums = {2,3,0,-1,4,-2};
        int nums[] = {4,5,0,-2,-3,1};
        int k = 2;
        System.out.println(solve(nums,k));
    }

    private static int solve(int[] num, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int sum = 0;
        int cnt = 0;

        for(int i : num){
            sum+=i;
            int rem = sum%k;
            if(rem<0)rem+=k;
            if(rem == 0)cnt++;

            if(map.containsKey(sum%k)){
                cnt+=map.get(sum%k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return cnt;
    }
}
