// 런타임 오류(Inputmismatch) => Clear
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class a_2338{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));

        br.close();
    }
}

// 이유는 모르겠음. 범위가 10진수의 1000자리를 넘지 않는다고 하여 long까지 쓸 필요가 없다고 생각했음.
// 아무리 안 하더라도 int에서 끝날 줄 알았는데 그게 아닌 것으로 보여짐.
// 생각해보면 input값에 문제가 있는 듯 한데, 막상 입력값을 넣어보면 답이 제대로 나오는 것을 확인함.

// 2024-02-20
// int형으로 받는 것이 아닌 BigInteger로 받아야 함.
// 1000자리 수를 넘기지 않는다고 하였는데 BigInteger로 받아야 하는 이유를 정확히 모르겠음.