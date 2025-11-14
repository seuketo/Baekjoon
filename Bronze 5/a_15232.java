import java.io.*;
public class a_15232 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < r; i++){
            for (int j = 1; j <= c; j++) System.out.print("*");
            System.out.print("\n");
        }
        br.close();
    }
}
