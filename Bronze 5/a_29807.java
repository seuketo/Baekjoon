import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class a_29807 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) arr[i] = Integer.parseInt(st.nextToken());
        int index = 0;
        if (Arrays.binarySearch(arr, 0) != 0) index = Arrays.binarySearch(arr, 0);
        int sum = 0;
        if (arr[0] > arr[2]) sum += (arr[0] - arr[2]) * 508;
        else sum += (arr[2] - arr[0]) * 108;
        if (arr[1] > arr[3]) sum += (arr[1] - arr[3]) * 212;
        else sum += (arr[3] - arr[1]) * 305;
        if (t == 5) sum += arr[4] * 707;
        sum *= 4763;
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_29807().run()
    }
}
