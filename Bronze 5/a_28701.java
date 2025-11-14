import java.io.*;
public class a_28701 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 3; i++){
            int result = 0;
            if (i == 2){
                int sum = 0;
                for (int j = 1; j <= n; j++) sum += j;
                result = (int) Math.pow(sum, i);
            } else for (int j = 1; j <= n; j++) result += Math.pow(j, i);
            sb.append(result + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}
