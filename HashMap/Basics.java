package HashMap;

import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("USA", 150);
        hm.put("China", 50);

        System.out.println(hm);

        //get - O(1)
        int population = hm.get("India");
        System.out.println(population); //100

        System.out.println(hm.get("Indonesia"));

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false

        //remove
        System.out.println(hm.remove("China"));

        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);
    }
}
