import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //(위)1,2,3,...,N(아래) 순서대로 카드가 있음
        //if 4일때 1 2 3 4
        // 2 3 4  - 1버림
        // 3 4 2 - 2를 아래로 옮김
        // 4 2 - 3버림
        // 2 4 - 4를 아래로 옮김
        // 4 - 2버림
        // 답 : 4

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }

        System.out.println(q.peek());

    }
}
