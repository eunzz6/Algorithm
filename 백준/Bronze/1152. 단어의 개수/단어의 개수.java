import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);

        int count = 0;

        while(st.nextToken() != StreamTokenizer.TT_EOF){
            count++;
        }
        System.out.print(count);
    }
}
