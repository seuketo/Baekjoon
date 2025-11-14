import java.io.*;
public class a_29731 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = {
            "Never gonna give you up", 
            "Never gonna let you down", 
            "Never gonna run around and desert you", 
            "Never gonna make you cry", 
            "Never gonna say goodbye", 
            "Never gonna tell a lie and hurt you", 
            "Never gonna stop"};
        boolean result = false;
        for (int i = 0; i < n; i++){
            String a = br.readLine();
            int c = 0;
            for (String b : arr){
                if (a.equals(b)) {
                    c = 1;
                    break;
                }
            }
            if (c == 0) result = true;
        }
        if (result == true) System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }
}   