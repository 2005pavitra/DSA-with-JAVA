package Problems_Practice.Recursion;

public class RatInMaze {
    int[] dr = {1, 0, 0, -1};
    int[] dc = {0, -1, 1, 0};

    char[] dir = {'D','L','R','U'};
    int currentR = 2;
    int currentC = 2;

// Loop through all 4 possible directions
    for (int i = 0; i < 4; i++) {
        int nextR = currentR + dr[i];
        int nextC = currentC + dc[i];
        char moveDir = dir[i];

        // nextR and nextC now point to the neighbor in direction moveDir
        System.out.println("Moving " + moveDir + " leads to: (" + nextR + ", " + nextC + ")");
    }

}
