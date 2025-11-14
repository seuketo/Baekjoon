// 이 코드는 메모리 초과로 해결 실패 처리 받았는데 도저히 해결 방법을 찾을 수가 없음.
// BigInteger를 사용해서 그냥 처음부터 multiply를 사용해 곱셈을 계속해봐도 시간 초과로 실패함. 자바로 풀려면 BigInteger에 대한 해결 방법이 필요해보임.
import java.io.*;
import java.math.BigInteger;
public class a_27434{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        
    }
    public long factorial(int n, int m){
        if (m == 0) return 1;
        else if (m == n) return n;
        else return m * factorial(n, m - 1);
    }
    public static void main(String[] args) throws Exception{
        new a_27434().run();
    }
}
