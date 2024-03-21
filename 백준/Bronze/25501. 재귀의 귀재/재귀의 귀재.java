import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();
            count = 0;
            System.out.println(isPalindrome(str.toCharArray()) + " " + count);
        }

    }

    static int recursion(char[] s, int l, int r) {
        count++;
        if (l >= r)
            return 1;
        else if (s[l] != s[r])
            return 0;
        else
            return recursion(s, l + 1, r - 1);
    }

    static int isPalindrome(char[] s) {
        return recursion(s, 0, s.length - 1);
    }
}