import java.io.*;
public class a_10886 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2];
        for (int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            arr[input]++;
        }
        if (arr[1] > arr[0]) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10886().run();
    }
}
