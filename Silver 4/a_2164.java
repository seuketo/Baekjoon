import java.io.*;
import java.util.*;

public class a_2164 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) q.addLast(i);

        while (q.size() > 1){
            q.pollFirst();
            q.addLast(q.pollFirst());
        }

        System.out.println(q.peekFirst());
        br.close();
    }

    public static void main(String[] args) throws IOException{
        try{
            new a_2164().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
