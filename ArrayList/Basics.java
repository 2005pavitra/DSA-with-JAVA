package ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        //part of java Collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add operation
        list.add(1);     //O(1)
        list.add(2);
        list.add(3);

        //adding at certain index
        list.add(3,5);   //O(n)

        System.out.println(list);

        //get operation
        System.out.println(list.get(2));

        //remove operation
        list.remove(2);
        System.out.println(list);

        //set element at x
        list.set(1, 10);
        System.out.println(list);

        //contains element
        System.out.println(list.contains(1));
        System.out.println(list.contains(2));

        //size method
        System.out.println(list.size());

        //print the arraylist
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }


}
