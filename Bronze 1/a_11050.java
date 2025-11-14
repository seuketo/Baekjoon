import java.io.*;
import java.util.*;

public class a_11050 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    public int factorial(int n){
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (k == 0 || n == k) System.out.println(1);
        else System.out.println(factorial(n) / (factorial(n - k) * factorial(k)));
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_11050().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
