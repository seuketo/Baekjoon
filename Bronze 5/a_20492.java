import java.io.*;
public class a_20492{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write((int) (n - (n * 0.22)) + " " + (int) (n - ((n * 0.2) * 0.22)));
        bw.close();
        br.close();
    }
}