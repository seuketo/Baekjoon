import java.io.*;
import java.util.StringTokenizer;
public class a_5717 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sen;
        while ((sen = br.readLine()) != null){
            if (sen.equals("0 0")) break;
            StringTokenizer st = new StringTokenizer(sen);
            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
        br.close();
    }
}
