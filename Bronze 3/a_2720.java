import java.io.*;
import java.util.ArrayList;
public class a_2720 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            ArrayList<Integer> charge = new ArrayList<>();
            int c = Integer.parseInt(br.readLine());
            charge.add(c / 25);
            c -= charge.get(0) * 25;
            charge.add(c / 10);
            c -= charge.get(1) * 10;
            charge.add(c / 5);
            c -= charge.get(2) * 5;
            charge.add(c);
            sb.append(charge.get(0) + " " + charge.get(1) + " " + charge.get(2) + " " + charge.get(3) + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2720().run();
    }
}
