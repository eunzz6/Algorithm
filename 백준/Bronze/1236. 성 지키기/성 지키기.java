import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StreamTokenizer st = new StreamTokenizer(br);

            st.nextToken();
            int n = (int)st.nval;
            st.nextToken();
            int m = (int)st.nval;

            char[][] castle = new char[n][m];

            for (int i = 0; i<n; i++){
                castle[i] = br.readLine().toCharArray();
            }

            //경비원 x 하나라도 있으면 카운팅
            int nx = 0;
            int mx = 0;

            //n 기준
            for(int i = 0; i<n; i++){
                boolean ox = false;
                for(int j = 0; j<m; j++)
                    if(castle[i][j] == 'X'){
                        ox = true;
                        break;
                    }
                if (ox) nx++;
            }

            //m기준
            for(int j = 0; j<m; j++){
                boolean ox = false;
                for(int i = 0; i<n; i++)
                    if(castle[i][j] == 'X'){
                        ox = true;
                        break;
                    }
                if (ox) mx++;
            }

            n = n-nx;
            m = m-mx;

            System.out.print(Math.max(n,m));


        }
}
