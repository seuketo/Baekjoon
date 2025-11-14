import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class a_2476 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> iarr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[6];
            int max = 0;
            for (int j = 0; j < 3; j++) arr[Integer.parseInt(st.nextToken()) - 1]++;
            for (int j = 0; j < 6; j++){
                if (arr[j] == 1) {if (max < j) max = j + 1;}
                else if (arr[j] == 2) max = 1000 + ((j + 1) * 100);
                else if (arr[j] == 3) max = 10000 + ((j + 1) * 1000);
            }
            if (max <= 6) iarr.add(max * 100);
            else iarr.add(max);
        }
        Collections.sort(iarr);
        System.out.println(iarr.get(n - 1));
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2476().run();
    }
}
