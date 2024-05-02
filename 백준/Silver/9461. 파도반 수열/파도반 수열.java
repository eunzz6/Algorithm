import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        long[] p = new long[101];
        p[1] = p[2] = p[3] = 1;
        p[4] = p[5] = 2;
        for (int i = 6; i <= 100; i++) {
            p[i] = p[i - 1] + p[i - 5];
        }

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            System.out.println(p[n]);
        }
        
        scanner.close();
    }
}
