import java.util.Scanner;

public class Main {

    static int window(char acgt) {
        if (acgt == 'A') return 0;
        else if (acgt == 'C') return 1;
        else if (acgt == 'G') return 2;
        else if (acgt == 'T') return 3;
        return -1;
    }

    static boolean isValid(int[] count, int[] dna_cnt){
        for(int i = 0; i<count.length; i++)
            if (count[i]<dna_cnt[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int p = sc.nextInt();
        char[] dna = sc.next().toCharArray();
        int[] dna_cnt = new int[4];
        for (int i = 0; i < 4; i++) {
            dna_cnt[i] = sc.nextInt();
        }

        int[] count = new int[4]; //윈도우
        for (int i =0; i<p-1; i++)
            count[window(dna[i])]++;
        int l = 0, r = p - 1, ans = 0;
        for (int i = p - 1; i < s; i++) {
            count[window(dna[i])]++;
            if (isValid(count, dna_cnt))
                ans++;
            count[window(dna[i-p+1])]--;
        }
        System.out.println(ans);
    }
}
