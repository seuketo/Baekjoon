import java.io.*;
public class a_23795 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int sum = 0;
        while (true){
            int n = Integer.parseInt(br.readLine()); 
            if (n == -1) break;
            sum += n;
        }
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_23795().run();
    }
}
