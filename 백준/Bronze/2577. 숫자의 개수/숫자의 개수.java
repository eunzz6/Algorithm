import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int num = a*b*c;
        String result = String.valueOf(num);

        int[] count = new int[10];

        for (int i = 0; i < result.length(); i++) {
            char digit = result.charAt(i);
            int numcount = Character.getNumericValue(digit);
            count[numcount]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
