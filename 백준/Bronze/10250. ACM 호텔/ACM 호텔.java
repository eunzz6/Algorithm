import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int stair = n % h;
            int room = n / h + 1;
            if (stair == 0){
                stair = h;
                room -= 1;
            }
            System.out.println(stair * 100 + room);
        }
    }
}
