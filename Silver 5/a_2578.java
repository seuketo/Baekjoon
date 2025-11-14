import java.io.*;
import java.util.StringTokenizer;
public class a_2578 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        bingo[] arr = new bingo[5];
        for (int i = 0; i < 5; i++) arr[i] = new bingo(br.readLine());

    }
    public static void main(String[] args) throws IOException{
        new a_2578().run();
    }

    
}

class bingo{
    int[] way = new int[5];
    StringTokenizer st;
    public bingo(String sen){
        st = new StringTokenizer(sen);
        for (int i = 0; i < 5; i++) way[i] = Integer.parseInt(st.nextToken());
    }

    public String find(){
        String result = "";
        for (int i = 0; i < 5; i++){
            if (way[i] == -1) result += "x";
            else result += Integer.toString(way[i]);
        }
        return result;
    }

}
