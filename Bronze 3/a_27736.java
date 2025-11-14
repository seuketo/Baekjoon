import java.io.*;
import java.util.StringTokenizer;
public class a_27736 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        while (st.hasMoreTokens()){
            int vote = Integer.parseInt(st.nextToken());
            if (vote == 1) arr[0]++;
            else if (vote == 0) arr[1]++;
            else arr[2]++;
        }
        if (n / 2 <= arr[1]) {
            if (n % 2 == 0) System.out.println("INVALID");
            else {
                if ((n / 2) + 1 <= arr[1]) System.out.println("INVALID");
                else{
                    if (arr[0] > arr[2]) System.out.println("APPROVED");
                    else System.out.println("REJECTED");
                }
            }
        }
        else{
            if (arr[0] > arr[2]) System.out.println("APPROVED");
            else System.out.println("REJECTED");
        }
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_27736().run();
    }
}
