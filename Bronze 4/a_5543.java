import java.io.*;
public class a_5543 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(br.readLine());
        if (arr[0] >= arr[1]){
            if (arr[1] <= arr[2]) sum += arr[1];
            else sum += arr[2];
        } else{
            if (arr[0] <= arr[2]) sum += arr[0];
            else sum += arr[2];
        }
        if (arr[3] <= arr[4]) sum += arr[3];
        else sum += arr[4];
        System.out.println(sum - 50);
        br.close();
    }
}
