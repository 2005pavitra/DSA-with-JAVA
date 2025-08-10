package Arrays_2D;

import java.util.Scanner;

public class Create2D {


    public static void search(int[][] arr, int target){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                if(arr[i][j] == target){
                    System.out.println("element found at cell: "+ i+" "+ j);
                }
            }
        }
    }


    public static void largest(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                max = Math.max(arr[i][j], max);
            }
        }
        System.out.println("largest number is: "+max);
    }

    public static void smallest(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                min = Math.min(arr[i][j], min);
            }
        }
        System.out.println("smallest number is: "+min);

    }

    public static void main(String arg[]){

        int [][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 9 elements for 2D array: ");
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        search(arr, 5);
        largest(arr);
        smallest(arr);

    }


}
