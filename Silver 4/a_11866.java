import java.io.*;
import java.util.*;

public class a_11866 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Deque<Integer> q = new ArrayDeque<>();

        sb.append("<");
        for (int i = 0; i < n; i++) q.addLast(i + 1);
        while (q.size() > 1){
            for (int i = 1; i < k; i++){
                q.addLast(q.pollFirst());
            }
            sb.append(q.pollFirst()).append(", ");
        }
        sb.append(q.pollFirst()).append(">");
        System.out.print(sb);
        br.close();

    }
    public static void main(String[] args) throws IOException{
        try{
            new a_11866().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}


