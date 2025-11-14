import java.io.*;
import java.util.StringTokenizer;
public class a_10801{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        int A_count = 0, B_count = 0;
        st = new StringTokenizer(br.readLine());
        int[] Aarr = new int[10];
        for (int i = 0; i < 10; i++) Aarr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] Barr = new int[10];
        for (int i = 0; i < 10; i++) Barr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 10; i++){
            if (Aarr[i] > Barr[i]) A_count++;
            else if (Aarr[i] < Barr[i]) B_count++;
            else continue;
        }
        System.out.println(A_count != B_count ? (A_count > B_count ? "A" : "B") : "D");
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_10801().run();
        } catch (IOException e){
            System.err.println("오류 : " + e.getMessage());
        }
    }
}