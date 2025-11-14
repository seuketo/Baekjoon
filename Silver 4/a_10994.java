import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class a_10994 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        int total = 1 + (4 * (t - 1));
        String sen = "*".repeat(total);
        int r_count = 1, l_count = 1;
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= (total + 1) / 2; i++){
            if (i == (total + 1) / 2){
                for (String word : arr) System.out.println(word);
                if (i % 2 != 0) System.out.println("* ".repeat(r_count) + "*".repeat(Math.max(0, total - (r_count * 4))) + " *".repeat(r_count));
                else System.out.println("* ".repeat(l_count - 1) + " ".repeat(Math.max(0, total - (l_count * 4))) + " *".repeat(l_count - 1)); 
            }
            else if (i == 1) arr.add(sen);
            else if (i != 1 && i % 2 != 0){
                arr.add("* ".repeat(r_count) + "*".repeat(Math.max(0, total - (r_count * 4))) + " *".repeat(r_count));
                r_count++;
            } else {
                arr.add("* ".repeat(l_count) + " ".repeat(Math.max(0, total - (l_count * 4))) + " *".repeat(l_count));
                l_count++;
            }
        }
        Collections.reverse(arr);
        for (String word : arr) System.out.println(word);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_10994().run();
    }
}
