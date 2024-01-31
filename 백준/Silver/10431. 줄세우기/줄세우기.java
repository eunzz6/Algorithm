import java.io.IOException;
import java.io.StreamTokenizer;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws IOException {
        StreamTokenizer st = new StreamTokenizer(System.in);

        //테스트케이스 수 입력
        st.nextToken();
        int p = (int)st.nval;

        //테스트 케이스 수 - 배열에 키 넣기
        int[][] k = new int[p][21];
        for (int i = 0; i<p; i++){
            for (int j = 0; j<21; j++){
                st.nextToken();
                k[i][j] = (int)st.nval;
            }
        }

        //오름차순으로 정렬하기, 바꿀때마다 밀린 개수대로 카운팅
        for (int i = 0; i<p; i++){
            int count = 0;
            for(int j = 1; j<21; j++){
                for(int n = 1; n<21-j; n++){
                    if (k[i][n]>k[i][n+1]){
                        int temp = k[i][n];
                        k[i][n]=k[i][n+1];
                        k[i][n+1]=temp;
                        count++;
                    }
                }
            }
            System.out.println((i+1)+" "+count);
        }
    }
}
