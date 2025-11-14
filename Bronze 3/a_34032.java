import java.io.*;
public class a_34032 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException {
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int o_count = 0;
        for (int i = 0; i < n; i++) if (arr[i] == 'O') o_count++;
        if (n % 2 != 0){
            if (o_count >= ((n / 2) + 1)) System.out.println("Yes");
            else System.out.println("No");
        } else {
            if (o_count >= n / 2) System.out.println("Yes");
            else System.out.println("No");
        }
        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_34032().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
