import java.io.*;
public class a_24883 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        if (a.equals("N") || a.equals("n")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
        br.close();
    }
}
