import java.io.*;

public class a_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        int index = 1;
        for (int i = 2; i <= 9; i++){
            int a = Integer.parseInt(br.readLine());
            if (max < a) {
                max = a;
                index = i;
            }
        }
        System.out.print(max + "\n" + index);
        br.close();
    }
}
