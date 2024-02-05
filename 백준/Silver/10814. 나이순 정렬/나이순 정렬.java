import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st.nextToken();
        int n = (int)st.nval;

        String[] arr = new String[n];

        for(int i = 0; i<n; i++) {
            st.nextToken();
            int years = (int) st.nval;

            st.nextToken();
            String name = st.sval;

            arr[i] = years + " " + name;

        }

        Arrays.sort(arr, Comparator.comparingInt(s -> Integer.parseInt(s.split(" ")[0])));

        for (int i = 0; i<n; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }
    private static void timsort(String[] arr){
        Arrays.sort(arr, Comparator.naturalOrder());
    }
}
