package ArrayList;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(221);
        list.add(3421);
        list.add(231);
        list.add(565);

        for(int i = 0; i<list.size()-1; i++){
            if(max< list.get(i)){
                max = list.get(i);
            }
//            max = Math.max(max, list.get(i));
        }

        System.out.println(max);
    }
}
