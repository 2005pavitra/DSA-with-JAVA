package Problems_Practice;

public class PalindromeCheck {

    public static boolean isPalindrome(String s){

        int n = s.length()-1;
        for(int i = 0; i< n; i++){
            if(s.charAt(i)!= s.charAt(n-i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s = "a";
        System.out.print(isPalindrome(s));
    }
}

/*
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;

        int l = 0, r = 0;
        int max = 0;
        String ans = new String();
        int n = s.length()-1;

        for(int i = 0; i<= n; i++){
            for(int j = i;j<= n; j++ ){
                String sb = s.substring(i, j+1);
                int sz = j-i+1;
                if(sz>max && isPalindrome(sb)){
                    max = sz;
                    l= i;
                    r = j;
                }


            }
        }
        ans = s.substring(l, r+1);


        return ans;


    }
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
*/