import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];
        String[] input = br.readLine().split(" ");
        int result = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(input[i]);
            result += num[i]*num[i] ;
        }

        System.out.println(result%10);
    }
}
