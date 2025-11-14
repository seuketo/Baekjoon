import java.io.*;

public class a_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--){
             for (int j = 0; j < i; j++) System.out.print("*");
             System.out.println();
        }
        br.close();
    }
}
