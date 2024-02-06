import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer (System.in);

        int[] c = new int[6];
        int[] w = {1, 1, 2, 2, 2, 8};

        for (int i=0; i<6; i++){
            st.nextToken();
            c[i] = (int)st.nval;
            c[i] = w[i]-c[i];
        }
        for (int i = 0; i<6; i++){
            System.out.print(c[i]+" ");
        }
    }
}



