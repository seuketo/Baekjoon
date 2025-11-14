import java.io.*;
public class a_5613 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int result = Integer.parseInt(br.readLine());
        while (true){
            String cal = br.readLine();
            switch (cal){
                case "+" : 
                    result += Integer.parseInt(br.readLine());
                    break;
                case "-" : 
                    result -= Integer.parseInt(br.readLine());
                    break;
                case "*" : 
                    result *= Integer.parseInt(br.readLine());
                    break;
                case "/" : 
                    result /= Integer.parseInt(br.readLine());
                    break;
                case "=" : break;
            }
            if (cal.equals("=")) break;
        }
        System.out.println(result);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_5613().run();
    }
}
