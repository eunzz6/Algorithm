import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] game = new int[n][n];
        long[][] route = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                game[i][j] = sc.nextInt();
            }
        }


        route[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int jump = game[i][j];
                if (jump == 0) continue;
                if (i + jump < n) route[i + jump][j] += route[i][j];
                if (j + jump < n) route[i][j + jump] += route[i][j];
            }
        }

        System.out.println(route[n - 1][n - 1]);

    }
}
