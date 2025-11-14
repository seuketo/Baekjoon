import java.io.*;
public class a_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] list = (br.readLine()).split("");
        int sum = 0;
        for (int i = 0; i < n; i++) sum += Integer.parseInt(list[i]);
        System.out.println(sum);
        br.close();
    }
}
