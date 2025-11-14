import java.io.*;
import java.util.*;

public class a_1427 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        long input = Long.parseLong(br.readLine());
        while (input > 0){
            int digit = (int) (input % 10);
            input /= 10;
            list.add(digit);
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) System.out.print(Integer.toString(list.get(i)));
        br.close();
    }
    public static void main(String[] args) throws IOException {
        try{
            new a_1427().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
