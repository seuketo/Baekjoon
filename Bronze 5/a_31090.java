import java.io.*;
public class a_31090 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            String n = br.readLine();
            int digit = Integer.parseInt(n.substring(2, 3));
            System.out.println(digit);
            if (digit != 0){
                if ((Integer.parseInt(n) + 1) % digit == 0) sb.append("Good\n");
                else sb.append("Bye\n");
            }
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_31090().run();
    }
}
