import java.io.*;
import java.util.StringTokenizer;
public class a_1236 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][m];
        int[] n_arr = new int[n];
        int[] m_arr = new int[m];
        int m_count = 0;
        int n_count = 0;
        for (int i = 0; i < n; i++) arr[i] = (br.readLine()).split("");
        for (int i = 0; i < n; i++) System.out.println(Integer.parseInt(arr[i]));
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (!arr[i][j].equals("X")) {
                    n_arr[i]++;
                    m_arr[j]++;
                }
                if (m_arr[j] == 0) m_count++;
            }
            if (n_arr[i] == 0) n_count++;
        }
        if (m_count >= n_count) System.out.println(n_count);
        else System.out.println(m_count);
        br.close();
    }
}
