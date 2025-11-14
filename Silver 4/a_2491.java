import java.io.*;
import java.util.StringTokenizer;
public class a_2491 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        int updown = 0;
        int max_len = 0;
        int len = 0;
        for (int i = 0; i < n; i++){
            if (max_len < len) max_len = len;
            if (updown == 0) {
                if (len == 0){
                    updown = 1;
                    len++;
                } else {
                    if (arr[i] < arr[i - 1]) updown = -1;
                    
                }
            }
            else if (updown == -1){
                if (arr[i] > arr[i - 1]) {
                    updown = 1;
                    len = 0;
                } else len++;
            } else{
                if (arr[i] < arr[i - 1]){
                    updown = -1;
                    len = 0;
                } else if (arr[i] == arr[i - 1]){
                    updown = 0;
                    len += 2;
                }
                else len++;
            }
            System.out.println("updown : " + updown + ", max_len : " + max_len + ", len : " + len);
        }
        System.out.println(max_len);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2491().run();
    }
}
