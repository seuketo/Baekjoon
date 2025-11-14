package Bronze_2;
import java.io.*;
import java.util.*;
public class a_6246 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        boolean[] balloon = new boolean[n];
        while(q --> 0){
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()) - 1;
            int i = Integer.parseInt(st.nextToken());
             while (l < n){
                if (!balloon[l]) balloon[l] = true;
                l += i;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) if (!balloon[i]) count++;
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_6246().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
