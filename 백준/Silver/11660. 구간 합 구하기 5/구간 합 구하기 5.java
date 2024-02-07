import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);

        st.nextToken();
        int n = (int)st.nval;
        st.nextToken();
        int m = (int)st.nval;

        int[][] nm = new int[n+1][n+1];

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                st.nextToken();
                nm[i][j] = (int)st.nval;
            }
        }

        int[][] nmp = new int[n+1][n+1];
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                nmp[i][j] = nmp[i-1][j]+nmp[i][j-1]-nmp[i-1][j-1]+nm[i][j];
            }
        }


        for(int i = 0; i<m; i++){
            st.nextToken();
            int x1 = (int)st.nval;
            st.nextToken();
            int y1 = (int)st.nval;
            st.nextToken();
            int x2 = (int)st.nval;
            st.nextToken();
            int y2 = (int)st.nval;

            System.out.println(nmp[x2][y2]-nmp[x1-1][y2]-nmp[x2][y1-1]+nmp[x1-1][y1-1]);

       }
    }
}



