
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        //바구니에 숫자 초기화
        for (int i = 0; i < n; i++) {
            basket[i] = i+1;
        }

        for (int k = 0; k < m; k++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            for (int i = start - 1, j = end - 1; i < j; i++, j--) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(basket[i] + " ");
        }

    }
}
