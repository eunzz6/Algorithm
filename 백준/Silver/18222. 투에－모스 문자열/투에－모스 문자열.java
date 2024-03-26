import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        System.out.println(findChar(k));
    }

    public static char findChar(long k){
        return Long.bitCount(k-1)%2 == 1 ? '1' : '0' ;
    }
}
