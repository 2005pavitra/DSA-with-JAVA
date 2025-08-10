package Strings;

public class ShortestPath {
    public static double shortest(String path){
        int x = 0; int y = 0;
        int n = path.length();

        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            }else{
                x--;
            }
        }
        return Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        shortest(path);
        System.out.println(" Shortest path distance: " + shortest(path));
    }
}
