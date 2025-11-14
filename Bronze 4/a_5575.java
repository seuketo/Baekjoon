import java.io.*;
public class a_5575 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        for (int i = 0; i < 3; i++){
            String[] arr = (br.readLine()).split(" ");
            int h = Integer.parseInt(arr[3]) - Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[4]) - Integer.parseInt(arr[1]);
            int s = Integer.parseInt(arr[5]) - Integer.parseInt(arr[2]);
            if (s < 0) {
                m--;
                s += 60;
            }
            if (m < 0){
                h--;
                m += 60;
            }
            sb.append(h + " " + m + " " + s + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5575().run();
    }
}
