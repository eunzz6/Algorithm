import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char[] p = word.toCharArray();
        char[] check = new char[p.length];

        for (int i = 0; i < p.length; i++) {
            check[i] = p[p.length - i - 1];
        }

            if (Arrays.equals(p,check))
                System.out.print(1);
            else System.out.print(0);
    }
}



