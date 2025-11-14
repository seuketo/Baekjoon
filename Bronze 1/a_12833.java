import java.io.*;
import java.util.*;
public class a_12833 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException {
        st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long one = a ^ b;
        long two = one ^ b;
        if (c % 2 != 0) System.out.println(one);
        else System.out.println(two);
        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_12833().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
