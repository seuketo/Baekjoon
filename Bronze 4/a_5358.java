import java.io.*;
public class a_5358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String sen;
        while ((sen = br.readLine()) != null){
            if (sen.isEmpty() == true) break;
            String[] arr = sen.split("");
            for (String a : arr){
                if (a.equals("i")) sb.append("e");
                else if (a.equals("I")) sb.append("E");
                else if (a.equals("e")) sb.append("i");
                else if (a.equals("E")) sb.append("I");
                else sb.append(a);
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}
