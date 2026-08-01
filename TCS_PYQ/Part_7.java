package TCS_PYQ;

public class Part_7 {
    public static void main(String[] args){
        int[] arr1 = {};
        int[] arr2 = {1};
        int[] arr3 = {1,1};
        int[] arr4 = {1,1,1};
        int[] arr5 = {1,4,3};

        System.out.println(smallest1(arr1));
        System.out.println(smallest2(arr1));
        System.out.println(smallest1(arr2));
        System.out.println(smallest2(arr2));
        System.out.println(smallest1(arr3));
        System.out.println(smallest2(arr3));
        System.out.println(smallest1(arr4));
        System.out.println(smallest2(arr4));
        System.out.println(smallest1(arr5));
        System.out.println(smallest2(arr5));

    }

    private static int smallest1(int [] arr){
        if(arr.length<=1)return -1;
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            min = Math.min(i, min);
        }

        return min;
    }
    private static int smallest2(int[] arr){
        if(arr.length<=1)return -1;

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i : arr){
            min = Math.min(i,min);
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i] != min){
                min2 = Math.min(arr[i],min2);
            }
        }

        if(min2 == Integer.MAX_VALUE)
            return -1;

        return min2;

    }
}
