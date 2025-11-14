import java.io.*;
public class a_4504 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int input;
        while ((input = Integer.parseInt(br.readLine())) != 0){
            if (input % n == 0) bw.write(input + " is a multiple of " + n + ".");
            else bw.write(input + " is NOT a multiple of " + n + ".");
            bw.newLine();
        }
        bw.close();
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_4504().run();
    }
}
