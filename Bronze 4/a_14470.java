// 보류
import java.io.*;
public class a_14470 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int time_count = 0;
        boolean ch = true;
        if (a > 0) ch = false;
        if (a <= 0){ 
            for (int i = a; i <= b; i++){
                if (i < 0) time_count += c;
                else if (i == 0 && ch == true) {
                    time_count += d;
                    ch = false;
                }
            }
        } else if (a >= 0){
            for (int i = a + 1; i <= b; i++){
                if (i == 0)
            }
        }
        System.out.println(time_count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_14470().run();
    }
}
