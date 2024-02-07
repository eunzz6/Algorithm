import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        int[] acc = new int[n+1];

        for(int i = 1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i<=n; i++){
            acc[i] = acc[i-1]+arr[i];
        }

        while(m-->0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(acc[j]-acc[i-1]);

        }
    }
}
