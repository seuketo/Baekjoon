import java.io.*;
import java.util.*;

public class a_11651{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a;
            arr[i][1] = b;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        for (int i = 0; i < n; i++) sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        sb.trimToSize();
        System.out.println(sb);
        br.close();

    }

    public static void main(String[] args) throws IOException{
        try{
            new a_11651().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}