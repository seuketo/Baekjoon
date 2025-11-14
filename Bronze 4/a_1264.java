import java.io.*;

public class a_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sen;
        while (!((sen = br.readLine()).equals("#"))){
            int count = 0;
            for (char c : sen.toCharArray()){
                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') count++; 
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }    
}
