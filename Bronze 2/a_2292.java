import java.io.*;
public class a_2292{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int six_multiply = 1, max_value = 1, count = 1;
        while (true){
            if (n <= max_value && (max_value - (6 * six_multiply)) + 1 <= n) break;
            else{
                max_value += 6 * six_multiply;
                count++;
                six_multiply++;
            } 
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_2292().run();
    }
}