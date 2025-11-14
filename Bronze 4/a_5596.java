import java.io.*;
import java.util.StringTokenizer;

public class a_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }
        if (arr[0] <= arr[1]) System.out.println(arr[1]);
        else System.out.println(arr[0]);
        br.close();
    }
}
