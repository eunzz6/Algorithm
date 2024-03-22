import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();

            if(num[i]<=1){
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j*j <= num[i]; j++) {
                if(num[i]%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                count++;
            }
        }


        System.out.println(count);

    }
}
