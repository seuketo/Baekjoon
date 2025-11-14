import java.io.*;
public class a_27465 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int time = (n % 24) % 12;
        
        br.close();
    }

    public void time_cal(int time){
        if (time == 1 || time % 2 == 0 || time % 3 == 0 || time % 5 == 0 || time % 7 == 0 || time == 11){
            if (time * 2 > 12) time = (time * 2) - 12;
            else time *= 2;
        }
        if (time <=)
    }
    public static void main(String[] args) throws IOException{
        new a_27465().run();
    }
}
