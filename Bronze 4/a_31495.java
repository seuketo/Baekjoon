package Bronze_4;
import java.io.*;
public class a_31495 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException {
        String s = br.readLine();

        if (s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"' && s.chars().filter(c -> c == '"').count() == 2 && s.length() >= 3)
            System.out.print(s.substring(1, s.length() - 1));
        else
            System.out.print("CE");
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_31495().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
