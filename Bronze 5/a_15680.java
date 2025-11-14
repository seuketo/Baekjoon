import java.io.*;
public class a_15680 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) System.out.print("YONSEI");
        else if (n == 1) System.out.print("Leading the Way to the Future");
        br.close();
    }
}
