import java.io.*;
import java.util.StringTokenizer;
public class a_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cal_m = (h * 60) + m - 45;
        if (cal_m < 0){
            h = 23;
            m += 60 - 45;
        } else{
            if (cal_m / 60 >= 24){
                h = (cal_m / 60) - 24;
                m = cal_m - (h * 60);
            } else{
                h = cal_m / 60;
                m = cal_m - (h * 60);
            }
        } 
        System.out.println(h + " " + m);
        br.close();
    }
}
