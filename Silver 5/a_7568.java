import java.io.*;
import java.util.*;

public class a_7568{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] kg = new int[n];
        int[] cm = new int[n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            kg[i] = Integer.parseInt(st.nextToken());
            cm[i] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[n];
        for (int i = 0; i < n; i++){
            rank[i] = 1;
            for (int j = 0; j < n; j++){
                if (kg[i] < kg[j] && cm[i] < cm[j]) rank[i]++;
            }
        }
        
        for (int i : rank) System.out.print(i + " ");
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_7568().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 - A의 몸무게 = x
 - A의 키 = y
    = (x, y)

 - B의 몸무게 = p
 - B의 키 = q
    = (p, q)

 - 만약 x > p, y > q라면 A가 덩치가 더 크다.
    => 키와 몸무게 모두 상대방보다 커야 덩치다 더 크다라고 간주.

 - 
 */
