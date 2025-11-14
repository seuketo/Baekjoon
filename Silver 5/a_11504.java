package Silver_5;
import java.io.*;
import java.util.*;
public class a_11504 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws  IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] xarr = new int[m];
            for (int i = 0; i < xarr.length; i++) xarr[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] yarr = new int[m];
            for (int i = 0; i < yarr.length; i++) yarr[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] list = new int[n];
            for (int i = 0; i < list.length; i++) list[i] = Integer.parseInt(st.nextToken());

            int count = 0;
            int index = 0;
            int end = 0;
            while (index < n + m) {
                if (index == n) end = 0;
                if (list[end] >= xarr[end] && list[end] < yarr[end]) {
                    count++;
                } else if (list[end] == yarr[end]) {
                    for (int j = end + 1; j < end + m; j++) {
                        if (list[j] < yarr[j]) {
                            count++;
                            break;
                        }
                        else if (list[j] == yarr[j]) continue;
                    }
                }
                index++;
                end++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_11504().run();
        } catch ( IOException e ) {
            System.err.println(e.getMessage());
        }
    }
}
