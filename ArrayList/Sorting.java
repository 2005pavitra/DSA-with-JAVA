package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(221);
        list.add(231);
        list.add(12);
        list.add(3421);
        list.add(565);

        System.out.println(list);
        Collections.sort(list);  //ascending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
