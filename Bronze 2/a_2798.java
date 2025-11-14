import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class a_2798 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int max = 0;
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        for (int i = 0; i < n; i++){
            if (max == m || i + 1 >= n) break;
            int first = arr[i];
            int lind = i + 1, rind = n - 1;
            int left = arr[lind];
            int right = arr[rind];
            while(left < right){
                int sum = first + left + right;
                if (sum > max && m > sum) max = sum;
                if (sum == m){
                    max = sum;
                    break;
                }
                else if (m < sum) right = arr[rind--];
                else if (sum < m) left = arr[lind++];
            }
        }
        System.out.println(max);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2798().run();
    }
}
