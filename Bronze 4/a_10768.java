import java.io.*;
public class a_10768{
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());
        if (month < 2) sb.append("Before");
        else if (month == 2){
            if (day < 18) sb.append("Before");
            else if (day == 18) sb.append("Special");
            else sb.append("After");
        } else sb.append("After");
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_10768().run();
    }
}
