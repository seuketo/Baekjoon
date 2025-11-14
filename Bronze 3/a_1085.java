import java.io.*;
import java.util.StringTokenizer;
public class a_1085 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        int min_index = 0;
        for (int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());
        if (arr[1] > arr[0]) min_index = arr[0];
        else min_index = arr[1];
        if (arr[2] - arr[0] > arr[3] - arr[1]){
            if (min_index > arr[3] - arr[1]) min_index = arr[3] - arr[1];
        } else{
            if (min_index > arr[2] - arr[0]) min_index = arr[2] - arr[0];
        }
        System.out.println(min_index);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_1085().run();
    }
}
