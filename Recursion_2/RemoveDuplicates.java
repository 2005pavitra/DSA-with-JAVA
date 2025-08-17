package Recursion_2;

public class RemoveDuplicates {
    public static void remove(String str, int index, StringBuilder newStr, boolean[] map){
        if(index == str.length()){
            System.out.println(newStr);
        }

        char currChar = str.charAt(index);

        if(map[currChar - 'a'] == true){
            remove(str, index + 1, newStr, map );
        }else{
            remove(str, index+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        remove("appnaacollege", 0, new StringBuilder(""),new  boolean[26]);
    }
}
