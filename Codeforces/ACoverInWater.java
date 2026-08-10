import java.util.Scanner;

public class ACoverInWater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            int dots = 0;
            int cnt = 0;
            for(int i = 0; i< n; i++){
                char c = s.charAt(i);
                if(c == '.'){
                    dots++;

                    if(dots>= 3 ){
                        cnt = 2;
//                        System.out.println("2");

                        break;
                    }
                }else{
                    cnt+=dots;
                    dots = 0;
                }

                if( i == n-1){
                    cnt += dots;
                }



            }
            if(cnt == 2){
                System.out.println("2");
            }else{
                System.out.println(cnt);
            }
//            System.out.println(cnt);
        }

    }
}
