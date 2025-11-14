import java.io.*;
import java.util.Arrays;
public class a_11948 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int[] arr1 = new int[4];
        int[] arr2 = new int[2];
        int sum = 0;
        for (int i = 0; i < 4; i++) arr1[i] = Integer.parseInt(br.readLine());
        for (int i = 0; i < 2; i++) arr2[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 3; i > 0; i--) sum += arr1[i];
        sum += arr2[1];
        sb.append(sum);
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_11948().run();
    }
}
