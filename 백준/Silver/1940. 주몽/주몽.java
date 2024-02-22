import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int count = 0, l = 0, r = n-1, sum = 0;

        while (l<r){
            sum = arr[l]+arr[r];
            if(sum < m){
                l++;
            }
            else if (sum > m){
                r--;
            }
            else if(sum == m){
                count++;
                l++;
                r--;
            }
        }
        System.out.println(count);
    }
}
