import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        for (int i = 1; i<=n; i++){
            int sum = 0;
            int j = i;
            while(sum<n){
                sum += j;
                j++;
            }
            if (sum==n){
                ans++;
            }
        }
        System.out.println(ans);
    }

}