import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);

        st.nextToken();
        int n = (int)st.nval;

        int[] a = new int[n];
        int[] b = new int[n];
        int[] s = new int[n];

        int temp = 0;

        for(int i = 0; i<n; i++){
            st.nextToken();
            a[i]=(int)st.nval;
        }
        for(int i = 0; i<n; i++){
            st.nextToken();
            b[i]=(int)st.nval;
        }
        Arrays.sort(a);
        b = Arrays.stream(b).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for(int i = 0; i<n; i++) {
            s[i] = a[i]*b[i];
            temp += s[i];
        }
        System.out.println(temp+"\n");
    }
}
