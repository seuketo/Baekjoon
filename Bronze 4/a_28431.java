import java.io.*;
public class a_28431 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int[] arr = new int[5];
        int nothing = 0;
        for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(br.readLine());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                if (i == j) continue;
                else if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0;
                    break;
                }
            }
            if (arr[i] != 0) nothing = arr[i];
        }
        System.out.println(nothing);
        br.close();

    }
    public static void main(String[] args) throws Exception{
        new a_28431().run();
    }
}
