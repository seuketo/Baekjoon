import java.io.*;
import java.util.StringTokenizer;
public class a_28444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(st.nextToken());
        int hi = arr[0] * arr[1];
        int arc = arr[2] * arr[3] * arr[4];
        System.out.println(hi - arc);
        br.close();
    }
}
