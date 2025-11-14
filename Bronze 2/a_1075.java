// wait

import java.io.*;
import java.math.BigInteger;

public class a_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int f = Integer.parseInt(br.readLine());
        char[] ch = n.toCharArray();
        String last = Character.toString(ch[ch.length - 1] + ch[ch.length]);
        int it = Integer.parseInt(last);
        if (it == 0) System.out.println(00); 
        else {
            for (int i = 0; i <= it; i++){
                if (i == it){
                    System.out.println(it);
                    break;
                } else if (i >= 0 && i <= 9);

            }
            
        }
        System.out.println(last);
    }
}
