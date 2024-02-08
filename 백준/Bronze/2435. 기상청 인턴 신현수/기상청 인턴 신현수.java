import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);

        st.nextToken();
        int n = (int)st.nval;
        st.nextToken();
        int k = (int)st.nval;

        int[] n_arr = new int[n];

        for(int i=0; i<n; i++){
            st.nextToken();
            n_arr[i] = (int)st.nval;
        }

        int[] k_arr = new int[n-k+1];
        for (int i=0; i<=n-k; i++){
            for (int j=0; j<k; j++){
                k_arr[i] += n_arr[i+j];
            }
        }

        Arrays.sort(k_arr);
        
        System.out.print(k_arr[k_arr.length-1]);
    }
}
