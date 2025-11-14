import java.io.*;
public class a_4740 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        String sen = "";
        while (!(sen = br.readLine()).equals("***")){
            char[] arr = sen.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) sb.append(arr[i]);
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_4740().run();
    }
}
