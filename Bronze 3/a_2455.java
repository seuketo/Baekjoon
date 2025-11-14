import java.io.*;
import java.util.StringTokenizer;
public class a_2455 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int sum = 0;
        int max = 0;
        for (int i = 0; i < 4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int minus = Integer.parseInt(st.nextToken());
            int plus = Integer.parseInt(st.nextToken());
            sum -= minus;
            sum += plus;
            if (max < sum){
                max = sum;
            }
        }
        System.out.println(max);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2455().run();
    }
}
