import java.io.*;
import java.util.*;
public class a_31833 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException {
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        String a = "";
        for (int i = 0; i < n; i++) a += st.nextToken();
        st = new StringTokenizer(br.readLine());
        String b = "";
        for (int i = 0; i < n; i++) b += st.nextToken();

        if (a.length() > b.length()) System.out.println(b);
        else if (a.length() < b.length()) System.out.println(a);
        else {
            int result = a.compareTo(b);
            if (result <= 0) System.out.println(a);
            else System.out.println(b);
        }

        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_31833().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
