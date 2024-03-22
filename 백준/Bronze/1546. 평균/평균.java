import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        float result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = arr[n-1];

        for (int i = 0; i < n; i++) {
            result += ((float)arr[i]/m)*100;
        }

        System.out.print(result/n);

    }
}
