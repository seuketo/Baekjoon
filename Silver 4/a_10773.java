import java.io.*;
import java.util.*;

public class a_10773 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < k; i++){
            int num = Integer.parseInt(br.readLine());
            if (num == 0) q.pollLast();
            else q.addLast(num);
            System.out.println("q.peekLast : " + q.peekLast());
        }
        while (q.size() != 0) sum += q.pollLast();
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_10773().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
