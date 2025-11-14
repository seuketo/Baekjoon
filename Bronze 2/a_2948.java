import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.TextStyle;
public class a_2948 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        LocalDate now = LocalDate.of(2009, m, d);
        String dayofweek = now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(dayofweek);
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_2948().run();
        } catch (IOException e){
            System.err.println("오류 : " + e.getMessage());
        }
    }

}
