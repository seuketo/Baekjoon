import java.io.*;
import java.util.StringTokenizer;
public class a_16199 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringTokenizer st1;
    StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        st1 = new StringTokenizer(br.readLine());
        int[] per = new int[3];
        int[] base = new int[3];
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            per[i] = Integer.parseInt(st.nextToken());
            base[i] = Integer.parseInt(st1.nextToken());
        }
        int year = base[0] - per[0];
        for (int i = 0; i < 3; i++) arr[i] = year;
        if (per[0] < base[0]){
            arr[1] = year + 1;
            if (per[1] < base[1]) arr[0] = year;
            else if (per[1] == base[1]) {
                if (per[2] <= base[2]) arr[0] = year;
                else arr[0] = year - 1;
            }
        } else if (per[0] == base[0]) arr[1] = 1;
        for (int i = 0; i < 3; i++) System.out.println(arr[i]);
        br.close();
    }
    public static void main(String[] args) throws Exception {
        new a_16199().run();
    }
}""
