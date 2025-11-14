package Bronze_2;
import java.io.*;
import java.util.*;
public class a_3622 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        String result = "";
        if (A <= P && B <= P){
            if (A < P && B < P){

            } else if (A < P){

            } else if (B < P){

            } else result = "No";
        } else result = "No";
        System.out.println(result);
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_3622().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
