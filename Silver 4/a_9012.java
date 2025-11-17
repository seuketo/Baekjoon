import java.io.*;
import java.util.*;

public class a_9012 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            Deque<Character> q = new ArrayDeque<>();
            String sen = br.readLine();
            for (int j = 0; j < sen.length(); j++){
                char now = sen.charAt(j);
                if (now == '(') q.addLast(now);
                else if (!q.isEmpty() && now == ')' && q.peekLast().equals('(')) q.pollLast();
                else if (q.isEmpty() && now == ')') q.addLast(now);
            }
            if (q.isEmpty()) sb.append("YES");
            else sb.append("NO");
            sb.append("\n");
         }
        sb.trimToSize();
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_9012().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
