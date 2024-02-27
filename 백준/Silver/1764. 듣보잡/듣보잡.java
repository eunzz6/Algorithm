import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] n_name = new String[n];
        String[] m_name = new String[m];

        for(int i = 0; i<n; i++){
            n_name[i] = sc.next();
        }
        for(int i = 0; i<m; i++){
            m_name[i] = sc.next();
        }

        Arrays.sort(n_name);
        Arrays.sort(m_name);

        HashSet<String> ans = new HashSet<>();
        int j = 0;
        for (int i = 0; i<n; i++) {
            while (j < m && m_name[j].compareTo(n_name[i]) < 0) {
                j++;
            }
            if (j < m && n_name[i].equals(m_name[j])) {
                ans.add(n_name[i]);
                j++;
            }
        }

        ArrayList<String> answer = new ArrayList<>(ans);
        answer.sort(null);

        System.out.println(answer.size());
        for(String name:answer){
            System.out.println(name);
        }
    }

}
