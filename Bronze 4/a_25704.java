import java.io.*;
import java.util.Arrays;
public class a_25704 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        int[] arr = new int[5];
        arr[0] = p;
        if (n >= 5) arr[1] = p - 500;
        if (n >= 10) arr[2] = p - (int) (p * 0.1);
        if (n >= 15) arr[3] = p - 2000;
        if (n >= 20) arr[4] = p - (int) (p * 0.25);
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 0) continue;
            else {
                System.out.println(arr[i]);
                break;
            }
        }
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_25704().run();
    }
}
