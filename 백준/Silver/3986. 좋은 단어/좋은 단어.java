import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        count = 0;

        while(n-->0){
            String word = br.readLine();
            check(word);
        }
        System.out.println(count);
    }

    static void check(String word){

        if (word.length() % 2 == 1) return;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<word.length(); i++) {
            if (stack.size() > 0 && stack.peek() == word.charAt(i)) {
                stack.pop();
            } else {
                stack.push(word.charAt(i));
            }
        }
        if (stack.isEmpty()) count++;
    }
}
