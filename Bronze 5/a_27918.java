import java.io.*;
public class a_27918 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2];
        for (int i = 0; i < n; i++){
            String point = br.readLine();
            if (point.equals("D")) arr[0]++;
            else arr[1]++;
            if (arr[0] - arr[1] == 2 || arr[1] - arr[0] == 2 || i == n - 1) {
                if (i != n - 1) for (int j = i + 1; j < n; j++) point = br.readLine();
                break;
            }
        }
        System.out.println(arr[0] + ":" + arr[1]);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_27918().run();
    }
}
