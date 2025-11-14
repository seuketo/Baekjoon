import java.io.*;
import java.util.StringTokenizer;
public class a_11943 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int[] arr = new int[4];
        for (int i = 0; i <= 2; i+=2){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i + 1] = Integer.parseInt(st.nextToken());
        }
        int gap = (arr[0] + arr[3]) - (arr[1] + arr[2]);
        if (gap > 0) sb.append(arr[1] + arr[2]);
        else if (gap == 0) sb.append(arr[0] + arr[3]);
        else sb.append(arr[0] + arr[3]);
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_11943().run();
    }
}

/*
        if (arr[0] < arr[2]) sb.append(arr[0] + arr[3]);
        else if (arr[0] == arr[2]){
            if (arr[1] <= arr[3]) sb.append(arr[0] + arr[1]);
            else if (arr[1] > arr[3]) sb.append(arr[0] + arr[3]);
        } else sb.append(arr[2] + arr[1]);
        System.out.print(sb);
        br.close();
 */
