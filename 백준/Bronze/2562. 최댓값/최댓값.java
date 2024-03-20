import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int big = 0;
        int num = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > big){
                big = arr[i];
                num = i+1;
            }
        }
        System.out.println(big);
        System.out.println(num);
    }
}
