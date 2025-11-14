import java.io.*;

public class a_23756 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int cur = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++){
            int next = Integer.parseInt(br.readLine());
            int d = Math.abs(cur - next);
            sum += Math.min(d, 360 - d);
            cur = next;
        }
        System.out.println(sum);
        br.close();

    }
    public static void main(String[] args) throws IOException {
        try{
            new a_23756().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}