import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class a_4153 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        String sen;
        while (!(sen = br.readLine()).equals("0 0 0")){
            StringTokenizer st = new StringTokenizer(sen);
            ArrayList<Integer> arr = new ArrayList<>();                             // int[] arr
            for (int i = 0; i < 3; i++) arr.add(Integer.parseInt(st.nextToken()));
            Collections.sort(arr);                                                  // Arrays.sort(arr)
            if (Math.pow(arr.get(0), 2) + Math.pow(arr.get(1), 2) == Math.pow(arr.get(2), 2)) sb.append("right\n");
            else sb.append("wrong\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_4153().run();
    }
}
