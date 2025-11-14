import java.io.*;
public class a_29766 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        String sen = br.readLine();
        int count = 0;
        int index = 0;
        for (char ch : sen.toCharArray()){
            if (index == 0 && ch == 'D') index++;
            else if (index == 1 && ch == 'K') index++;
            else if (index == 2 && ch == 'S') index++;
            else if (index == 3 && ch == 'H'){
                    index = 0;
                    count++;
                }
            else index = 0;
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_29766().run();
    }
}
