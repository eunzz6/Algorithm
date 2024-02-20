import java.io.IOException;
import java.util.Scanner;

public class Main {
    static boolean isPossible(int[] h, int cut_h, int m){
        long sum = 0;
        for (int tree : h )
            if(tree>cut_h)
                sum += tree - cut_h;
        return sum >= m;
    }
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt(); //나무갯수
        int m = sc.nextInt(); //집에 가져가야하는 나무길이
        int[] tree = new int[n];

        for(int i = 0; i<n; i++){
            tree[i] = sc.nextInt();
        }

        //절단기 높이가 될 수 있는 범위 0부터 10억
        int l = 0, r = 1000000000, answer = -1;

        while (l <= r){
            int mid = (l+r)/2;
            if(isPossible(tree, mid, m)){
                answer = mid;
                l = mid+1;
            }
            else r = mid-1;
        }

        System.out.println(answer);

    }
}