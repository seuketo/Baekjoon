import java.io.*;
public class a_1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String sen = br.readLine();
            if (sen.equals("0")) break;
            StringBuilder reverse_sb = new StringBuilder(sen).reverse();
            if (sen.equals(reverse_sb.toString())) sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.print(sb);
        br.close();
    }
}
