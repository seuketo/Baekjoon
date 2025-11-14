// 이거 좀 많이 중요한듯.
// BigInteger를 사용하지 않고 백만제곱 이하의 수를 나눠서 나머지를 구하는 식이기 때문에 굉장히 중요하다고 봄.
import java.io.*;
public class a_14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();
        br.close();
        int remainder = 0;
        for (int i = 0; i < n.length(); i++){
            int digit = n.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % 20000303;
        }
        System.out.print(remainder);
    }
}
