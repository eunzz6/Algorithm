import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        StreamTokenizer st = new StreamTokenizer(System.in);

        st.nextToken();
        int n = (int)st.nval;

        int[] num = new int[n];

        for (int i = 0; i<n; i++){
            st.nextToken();
            num[i] = (int)st.nval;
        }

        st.nextToken();
        int v = (int)st.nval;

        int count = 0;

        for (int j = 0; j<num.length; j++){
            if(num[j] == v){
                count +=1;
            }
        }
        System.out.println(count);
    }
}
