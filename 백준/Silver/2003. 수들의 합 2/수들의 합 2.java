import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int count = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        
        while ( start < n ){
            if (sum < m) {
                if (end == n) break;
                sum += a[end++];
            }
            else if (sum >= m){
                sum -= a[start++];
            }
            
            if (sum == m){
                count++;
            }
        }
        System.out.println(count);
    }
}