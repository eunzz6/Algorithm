import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] an = new int[a];
            int[] bm = new int[b];

            for(int j=0; j<a; j++){
                an[j] = sc.nextInt();
            }
            for (int k=0; k<b; k++){
                bm[k] = sc.nextInt();
            }
            Arrays.sort(bm);
            
            int count = 0;
            for (int j = 0; j<a; j++){
                for (int k = 0; k<b; k++){
                    if (an[j]>bm[k]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
