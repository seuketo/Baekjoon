import java.io.*;
import java.util.StringTokenizer;
public class a_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        double sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0; i < n; i++) sum += arr[i] * 100 / max;
        if (sum / n == sum / n) System.out.println(sum / n);
        else System.out.printf("%.6f", sum / n);
        br.close();
    }
}
