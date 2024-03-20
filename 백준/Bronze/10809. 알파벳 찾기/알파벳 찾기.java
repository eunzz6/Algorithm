import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] count = new int[26];

        for (int i = 0; i <26; i++) {
            count[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                int index = ch - 'a';
                if (count[index] == -1){
                    count[index] = i;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
