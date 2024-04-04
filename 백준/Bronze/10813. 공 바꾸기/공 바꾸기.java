import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        //공값 초기화
        for (int i = 0; i <n; i++) {
            basket[i] = i+1;
        }

        //공 바꾸기
        for (int i = 0; i <m; i++) {
            int original = sc.nextInt();
            int change = sc.nextInt();
            int original_copy = basket[original-1];

            basket[original-1] = basket[change-1];
            basket[change-1] = original_copy;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
