import java.io.*;
import java.util.Arrays;
public class a_9046 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            char[] arr = (br.readLine()).toCharArray();
            int[] count = new int[26];
            for (char c : arr) {
                if (c == ' ') continue;
                else count[c - 'a']++;
            }
            int maxnum = count[0];
            int maxindex = 0;
            for (int j = 1; j < 26; j++){
                if (maxnum < count[j]){
                    maxnum = count[j];
                    maxindex = j;
                }
            }
            Arrays.sort(count);
            if (count[24] == count[25]) sb.append("?\n");
            else sb.append((char) (97 + maxindex) + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_9046().run();
    }
}
