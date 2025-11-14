import java.io.*;
public class a_27889 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        if (a.equals("NLCS")) System.out.print("North London Collegiate School");
        else if (a.equals("BHA")) System.out.print("Branksome Hall Asia");
        else if (a.equals("KIS")) System.out.print("Korea International School");
        else if (a.equals("SJA")) System.out.print("St. Johnsbury Academy");
        br.close();
    }
}
