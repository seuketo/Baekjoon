import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class a_2576 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 7; i++){
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0){
                arr.add(n);
                sum += n;
            }
        }
        Collections.sort(arr);
        if (!arr.isEmpty()) System.out.println(sum + "\n" + arr.get(0));
        else System.out.println(-1);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2576().run();
    }
}
