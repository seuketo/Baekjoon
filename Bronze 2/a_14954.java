/*
임의의 자연수 n에 대하여 다음과 같이 정의된 함수 f를 생각해 보자:

f(n)은 십진법(또는 십진법-십진법)으로 n자리의 제곱을 더한 수치입니다.

예를 들어 n = 19이면 1² + 9² = 82이므로 f(19) = 82입니다.

이 함수 f를 반복적으로 적용하면 어떤 자연수들은 결국 1이 됩니다. 이러한 수를 행복수라고 부릅니다. 예를 들어 19에 함수 f를 반복적으로 적용하면 다음과 같은 결과가 나오기 때문에 19는 행복수입니다:

f(19) = 1² + 9² = 82
f(82) = 8² + 2² = 68
f(68) = 6² + 8² = 100
f(100) = 1² + 0² + 0² = 1
그러나 모든 자연수가 행복한 것은 아닙니다. 
5를 시도해 보면 5는 행복한 수가 아니라는 것을 알 수 있을 것입니다. 
만약 n이 행복한 수가 아니라면 함수 f를 반복적으로 적용하면 다음과 같은 사이클에 이른다는 것이 수학자들에 의해 증명되었습니다:

4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4.

주어진 자연수 n이 행복수인지 아닌지를 결정하는 프로그램을 작성합니다.
 */
import java.io.*;
import java.util.ArrayList;
public class a_14954 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        String n = br.readLine();
        String decision = "";
        ArrayList<Integer> list = new ArrayList<>();
        boolean tf = false;
        while (true){
            if (n.equals("1") || decision.equals("1")){
                tf = true;
                break;
            } else if (decision.equals("4")) break;
            char[] arr;
            int sum = 0;
            if (decision.equals("")) arr = n.toCharArray();
            else arr = decision.toCharArray();
            for (char a : arr) sum += Math.pow(Character.getNumericValue(a), 2);
            decision = Integer.toString(sum);
            if (list.contains(sum)) break;
            else list.add(sum);
        }
        if (tf == true) System.out.println("HAPPY");
        else System.out.println("UNHAPPY");
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_14954().run();
    }
}

/*
        while (n.equals(decision)){
            if (Integer.parseInt(n) != 1 && decision.equals("")) decision = n;
            else if (Integer.parseInt(n) == 1 || Integer.parseInt(decision) == 1) {
                tf = true;
                break;
            }
            else if (Integer.parseInt(n) != 4 && Integer.parseInt(decision) == 4) break;
            char[] arr = decision.toCharArray();
            int powsum = 0;
            for (char a : arr) powsum += Math.pow(a, 2);
            decision = Integer.toString(powsum);
        }
 */

/*
 - 계속 반복되는 수의 경우 행복수라고 가정. (1만 해당)
 - 그 외 4가 나오는 수 혹은 이전에 나온 수가 다시 한번 나올 경우 해당 수는 행복하지 않은 수로 지정.
 */