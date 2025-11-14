import java.io.*;
import java.util.StringTokenizer;
public class a_4344 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            double avg = 0, total = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                avg += arr[j];
            }
            avg /= n;
            for (int a : arr){
                if (avg < a) total++;
            }
            sb.append(String.format("%.3f", (double) (Math.round(total * ((double) 100 / (double) n) * 100) / 100))).append("\n");
            //sb.append((double) Math.round((total * (100 / n)) * 1000)).append("\n");
            //String.format("%.3f", (double) (total * (100 / n)))
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_4344().run();
    }
}
