import java.io.*;
public class a_31821 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) sum += arr[Integer.parseInt(br.readLine()) - 1];
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_31821().run();
    }
}
