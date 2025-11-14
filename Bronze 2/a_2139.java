import java.io.*;
import java.util.StringTokenizer;
public class a_2139 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws IOException{
        String sen;
        while (!(sen = br.readLine()).equals("0 0 0")){
            st = new StringTokenizer(sen);
            int sum = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            boolean leap = false;
            if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) leap = true;
            if (month != 1){
                for (int i = 1; i < month; i++){
                    if (i == 2 || i == 4 || i == 6 || i == 9 || i == 11){
                        if (i == 2){
                            if (leap == true) sum += 29;
                            else sum += 28;
                        }
                        else sum += 30;
                    }
                    else sum += 31;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2139().run();
    }
}
