import java.io.*;
public class a_28691 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        if (a.equals("M")) sb.append("MatKor");
        else if (a.equals("W")) sb.append("WiCys");
        else if (a.equals("C")) sb.append("CyKor");
        else if (a.equals("A")) sb.append("AlKor");
        else if (a.equals("$")) sb.append("$clear");
        System.out.print(sb);
        br.close();
    }
}
