package Backtracking;

public class Permutation {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i = 0; i <str.length(); i++){
            char curr = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);
            findPermutation(newString,ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
