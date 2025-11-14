import java.io.*;
import java.util.StringTokenizer;
public class a_8949 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int len = Math.max(a.length(), b.length());
        char[] one = new char[len];
        char[] two = new char[len];
        for (int i = len - 1; i >= 0; i--){
            if (len == a.length()){
                one[i] = a.charAt(i);
                if (a.length() > b.length() && (len - b.length()) > i) two[i] = '0';
                else two[i] = b.charAt(i);
            } else{
                two[i] = b.charAt(i);
                if (a.length() < b.length() && (len - a.length()) > i) one[i] = '0';
                else one[i] = a.charAt(i);
            }
        }
        for (int i = 0; i < len; i++) sb.append(Integer.toString((one[i] - '0') + (two[i] - '0')));
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_8949().run();
    }
}
