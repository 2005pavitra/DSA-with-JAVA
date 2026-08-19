import java.util.*;

public class AButtons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();

            int first = a+c;
            int sec = b+c;

            if(first<sec){
                System.out.println("Second");
            }else if(sec<first){
                System.out.println("First");
            }else if(first == sec){
                if(c % 2 == 1){
                    System.out.println("First");
                }else{
                    System.out.println("Second");
                }
            }
            
        }
    }
}