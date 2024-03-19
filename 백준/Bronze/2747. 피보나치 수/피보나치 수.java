import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = fibo(n);
        System.out.println(result);

    }

    public static int fibo(int n){
        if (n == 0 ) return 0;
        if (n == 1 ) return 1;

        int prev = 0;
        int current = 1;
        int next;

        for(int i = 2; i<=n; i++){
            next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }
}
