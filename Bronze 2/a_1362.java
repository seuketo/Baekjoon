import java.io.*;
import java.util.*;
public class a_1362 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException {
        int i = 1;
        while (true){
            st = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if (o == 0 && w == 0) break;
            else{
                if (!sb.toString().isEmpty()) sb.append("\n");
                int half = o / 2;
                int dou = o * 2;
                boolean alive = true;
                String word;
                int num;
                while (true){
                    st = new StringTokenizer(br.readLine());
                    word = st.nextToken();
                    num = Integer.parseInt(st.nextToken());
                    if (word.equals("#") && num == 0) break;
                    if (alive){
                        if (word.equals("E")) w -= num;
                        else if (word.equals("F")) w += num;
                        if (w <= 0) alive = false;
                    }
                }
                if (w > half && w < dou) sb.append(i + " :-)");
                else if (w <= 0) sb.append(i + " RIP");
                else sb.append(i + " :-(");
                i++;
            }
        }
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_1362().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 - 해당 문제에서 무시할 수 없는 부분이 하나 있는데, 이는 다음과 같음.
    - 0이 될 경우 사망 판정을 받아야 함. 근데 해당 경우는 0이 되었음에도 코드를 계속 진행하면서 연산을 하고 있음.
    - 즉, 0이 된 경우 사망 판정을 내릴 수 있는 변수를 하나 따로 마련하는 편이 좋음.
 */