import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        StreamTokenizer st = new StreamTokenizer(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st.nextToken();
        int x = (int)st.nval;
        st.nextToken();
        int t = (int)st.nval;

        int total = 0;

        for (int i=0; i<t; i++){
            st.nextToken();
            int won = (int)st.nval;
            st.nextToken();
            int ea = (int)st.nval;
            total += (won*ea);
        }
        if (total == x){
            System.out.print("Yes");}
        else {System.out.print("No");}

    }

}
