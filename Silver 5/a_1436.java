import java.io.*;
public class a_1436 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 0;
        while (true){
            if (String.valueOf(num).contains("666")) count++;
            if (count == n) break;
            num++;
        }
        System.out.println(num);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_1436().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
