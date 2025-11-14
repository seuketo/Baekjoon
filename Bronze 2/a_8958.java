import java.io.*;
public class a_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++){
            String[] arr = (br.readLine()).split("");
            int count = 0;
            int sum = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[j].equals("O")) count++;
                else count = 0;
                sum += count;
            }
            sb.append(sum + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}
