import java.io.*;
import java.util.StringTokenizer;
public class a_4619 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String sen;
        int min = 0;
        while (!(sen = br.readLine()).equals("0 0")){
            StringTokenizer st = new StringTokenizer(sen);
            int b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
            for (int i = 1; i < b; i++){
                if (min == 0) min = (int) Math.pow(i, b);
                if (Math.pow(i, b) - )
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new a_4619().run();
    }
}
