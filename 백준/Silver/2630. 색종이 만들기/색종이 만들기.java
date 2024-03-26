import java.util.Scanner;

public class Main {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                paper[i][j] = sc.nextInt();
            }
        }

        cutpaper(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    static void cutpaper(int a, int b, int size) {
        int color = paper[a][b];

        for (int i = a; i < a + size; i++) {
            for (int j = b; j < b + size; j++) {
                if (paper[i][j] != color) {
                    cutpaper(a, b, size / 2);
                    cutpaper(a, b + size / 2, size / 2);
                    cutpaper(a + size / 2, b, size / 2);
                    cutpaper(a + size / 2, b + size / 2, size / 2);
                    return;
                }

            }
        }
        if (color == 0) white++;
        else blue++;
    }
}
