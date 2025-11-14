import java.io.*;
public class a_15727 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int l = Integer.parseInt(br.readLine());
        int x = l / 5;
        if (l == x * 5) System.out.print(x);
        else System.out.print(x + 1);
        br.close();
    }
}