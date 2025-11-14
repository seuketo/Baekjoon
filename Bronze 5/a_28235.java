import java.io.*;
public class a_28235 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        if (a.equals("SONGDO")) sb.append("HIGHSCHOOL");
        else if (a.equals("CODE")) sb.append("MASTER");
        else if (a.equals("2023")) sb.append("0611");
        else if (a.equals("ALGORITHM")) sb.append("CONTEST");
        System.out.print(sb);
        br.close();
    }    
}
