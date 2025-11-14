import java.io.*;
import java.util.StringTokenizer;
public class a_29752 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int result = 0;
        int stric = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++){
            if (arr[i] > 0) stric++;
            else {
                if (stric > result) result = stric;
                stric = 0;
            }
        }
        if (stric > result) result = stric;
        System.out.println(result);
        br.close();
    }  
    public static void main(String[] args) throws IOException{
        new a_29752().run();
    }
}
