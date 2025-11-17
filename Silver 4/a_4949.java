import java.io.*;
import java.util.*;

public class a_4949 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        String sen;
        while (!(sen = br.readLine()).equals(".")){
            Deque<Character> q = new ArrayDeque<>();
            for (int i = 0; i < sen.length(); i++){
                char now = sen.charAt(i);
                if (now == '(' || now == '[') q.addLast(now);
                else if ((q.isEmpty() && (now == ')' || now == ']'))) q.addLast(now);
                else if (!q.isEmpty() && (now == ')' && (q.peekLast().equals('['))) || (now == ']' && (q.peekLast().equals('(')))) q.addLast(now);
                else if (!q.isEmpty() && (now == ')' && q.peekLast().equals('(')) || (now == ']' && q.peekLast().equals('['))) q.pollLast();
            }
            if (q.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        sb.trimToSize();
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_4949().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}



/*
 * 괄호 짝 맞추는 계산은 배열로 계산하는 편이 옳을 것 같다.
 * 온점을 넘어가서 기록된 괄호가 존재할 경우 해당 괄호는 기록하지 않는다.
 * 
 * 
 * 
            System.out.println("Sentence : " + sen);
            for (char a : q) System.out.print(a + " ");
            System.out.println();
 */
