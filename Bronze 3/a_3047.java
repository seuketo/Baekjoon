import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;
public class a_3047 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        ArrayList<Integer> arrlist = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) arrlist.add(Integer.parseInt(st.nextToken()));
        Collections.sort(arrlist);
        char[] arr = (br.readLine()).toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 'A') sb.append(arrlist.get(0));
            else if (arr[i] == 'B') sb.append(arrlist.get(1));
            else sb.append(arrlist.get(2));
            if (i != arr.length - 1) sb.append(" ");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_3047().run();
    }
}
