import java.io.*;
public class a_31775 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        boolean tf = true;
        for(int i = 0; i < 3; i++){
            String sen = (br.readLine()).substring(0, 1);
            System.out.println(sen);
            if (!(sen.equals("k") || sen.equals("l") || sen.equals("p"))) tf = false;
        }
        if (tf == true) System.out.println("GLOBAL");
        else System.out.println("PONIX");
    }
    public static void main(String[] args) throws Exception{
        new a_31775().run();
    }
}
