import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];

        //바구니에 일단 0을 다 넣기
        for (int i = 0; i <n; i++) {
            basket[i] = 0;
        }

        //공의 범위와 숫자 입력받기
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ball = sc.nextInt();

            for (int j = start-1; j < end; j++) {
                basket[j] = ball;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
