import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for (int i = 0; i<n; i++){
            String[] word = br.readLine().split(" ");
            System.out.print("Case #" + (i+1) + ": ");

            if (word.length == 1){
                System.out.println(word[0]);
                continue;
            }
            for(int j = 0; j<word.length; j++){
                stack.push(word[j]);
            }
            while (!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
            stack.clear();
        }
    }
}
