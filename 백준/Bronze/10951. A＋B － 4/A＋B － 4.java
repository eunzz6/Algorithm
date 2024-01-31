import java.io.IOException;
import java.io.StreamTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);

        while (true) {
            st.nextToken();
            int a = (int) st.nval;

            // 입력이 끝나면 종료
            if (st.ttype == StreamTokenizer.TT_EOF) {
                break;
            }

            st.nextToken();
            int b = (int) st.nval;

            System.out.println(a + b);
        }
    }
}
