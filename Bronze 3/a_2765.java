import java.io.*;
import java.util.StringTokenizer;
public class a_2765 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        double r2 = 0, spin = 1, time = 0, movement = 0, mph = 0;
        int index = 1;
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            r2 = Double.parseDouble(st.nextToken());
            spin = Double.parseDouble(st.nextToken());
            time = Double.parseDouble(st.nextToken());
            if (spin == 0) break;
            movement = ((r2 / 2) * 2 * spin * 3.1415927) / 63360;
            mph = movement / (time / 3600);
            sb.append(String.format("Trip #%d: %.2f %.2f\n", index, movement, mph));
            index++;
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2765().run();
    }
}

// 660피트 = 201.168m