import java.util.Scanner;

public class Main {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String vps = sc.nextLine();
            if (isVPS(vps)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isVPS(String vps) {
        count = 0;

        for (int i = 0; i < vps.length(); i++) {
            if (vps.charAt(i) == '(') {
                count++;
            } else {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}

