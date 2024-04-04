import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] check = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int student = sc.nextInt();
            check[student-1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!check[i]){
                System.out.println(i+1);
            }
        }

    }
}
