import java.io.*;
public class a_4096 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n;
        while ((n = Integer.parseInt(br.readLine)) != 0){
            int count = 0;
            if (Integer.toString(n).length() % 2 == 0){
                while (true){
                    char[] ch = Integer.toString(n).toCharArray();    
                    for (int i = 0; i < n; i++){
                        if (ch[i] != ch[n - (i + 1)]){
                            n++;
                            count++;
                            break;
                        }
                    }
                }
            } else{
                
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new a_4096().run();
    }
}
