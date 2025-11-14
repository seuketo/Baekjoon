import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
public class a_2501 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0) arr.add(i);
        }
        Collections.sort(arr);
        if (k <= arr.size()) System.out.println(arr.get(k - 1));
        else System.out.println(0);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2501().run();
    }
}
