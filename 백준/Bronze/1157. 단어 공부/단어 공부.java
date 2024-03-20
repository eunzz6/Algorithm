import java.util.Scanner;

public class Main {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') //대문자일 경우
                count[ch - 'A']++;
            else count[ch - 'a']++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int[] count = getAlphabetCount(a);

        int maxCount = -1;
        char maxAlphabetIndex = '?';
        for (int i = 0; i < 26; i++){
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabetIndex = (char)('A'+i);
            }
            else if (count[i] == maxCount){
                maxAlphabetIndex = '?';
        }

        }
        System.out.println((char)(maxAlphabetIndex));
    }

}