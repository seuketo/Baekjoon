import java.io.*;
import java.util.StringTokenizer;
public class a_25591 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] arr = new int[6];
        arr[0] = 100 - n;
        arr[1] = 100 - t;
        arr[2] = 100 - (arr[0] + arr[1]);
        arr[3] = arr[0] * arr[1];
        arr[4] = arr[3] / 100;
        arr[5] = arr[3] % 100;
        for (int i = 0; i < 6; i++){
            if (i == 5) sb.append(arr[i] + "\n");
            else sb.append(arr[i] + " ");
        }
        if (arr[3] >= 100){
            arr[2] += arr[3] / 100;
            arr[3] = arr[3] % 100;
        }
        for (int i = 2; i <= 3; i++) sb.append(arr[i] + " ");
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25591().run();
    }
}