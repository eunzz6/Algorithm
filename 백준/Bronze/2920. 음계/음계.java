import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg) throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);

        int[] num = new int[8];
        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descendig = {8,7,6,5,4,3,2,1};

        for ( int i = 0; i<8; i++){
            st.nextToken();
            num[i] = (int)st.nval;
        }

        if (Arrays.equals(num,ascending)){
            System.out.print("ascending");
        }
        else if (Arrays.equals(num,descendig)){
            System.out.print("descending");
        }
        else System.out.print("mixed");
    }

}
