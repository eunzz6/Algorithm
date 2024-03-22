import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();

            if(n == 0){
                break;
            }
            
            String num = String.valueOf(n);
            boolean Palindrome = true;

            for (int i = 0; i < num.length(); i++) {
                if(num.charAt(i) != num.charAt(num.length()-i-1)){
                    Palindrome = false;
                    break;
                }
            }
            if(Palindrome){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
