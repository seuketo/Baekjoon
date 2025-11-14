import java.io.*;
import java.util.StringTokenizer;
public class a_14467 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) arr[i] = -1;
        for (int i = 0; i < n; i++){ 
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            if (arr[a - 1] == -1) arr[a - 1] = b;
            else if ((arr[a - 1] == 0 && b == 1) || (arr[a - 1] == 1 && b == 0)) {
                count++;
                arr[a - 1] = b;
            }
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_14467().run();
    }
}
