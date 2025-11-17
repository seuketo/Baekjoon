import java.io.*;
import java.util.*;

public class a_10845 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) num = Integer.parseInt(st.nextToken());

            if (order.equals("push")) q.addLast(num);
            else if (order.equals("pop")){
                if (q.isEmpty()) sb.append(-1);
                else sb.append(q.pollFirst());
                sb.append("\n");
            }
            else if (order.equals("size")){
                sb.append(q.size()).append("\n");
            }
            else if (order.equals("empty")){
                if (q.isEmpty()) sb.append(1);
                else sb.append(0);
                sb.append("\n");
            }
            else if (order.equals("front")){
                if (q.isEmpty()) sb.append(-1);
                else sb.append(q.peekFirst());
                sb.append("\n");
            }
            else if (order.equals("back")){
                if (q.isEmpty()) sb.append(-1);
                else sb.append(q.peekLast());
                sb.append("\n");
            }
        }
        sb.trimToSize();
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_10845().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
