/*
문제
어군 탐지기는 낚시꾼이 호수 속 물고기를 찾는 데 쓰는 장비입니다. 
어군 탐지기가 물고기를 찾으면, 알람이 울립니다. 
어군 탐지기는 알람을 울릴지 말지 결정하는 데 깊이 탐지를 사용합니다. 
이 문제에서 어군 탐지기는 아래와 같은 경우에 물고기가 아래를 지나가고 있다 판단할 것입니다:

- ("Fish Rising"이라 부르는) 네 번의 연속된 깊이 탐지 결과가 (3 4 7 9와 같이) 강한 증가 수열을 이루거나,

- ("Fish Diving"라고 부르는) 네 번의 연속된 깊이 탐지 결과가 (9 6 5 2와 같이) 강한 감소 수열을 이루거나,

- ("Constant Depth"라고 부르는) 네 번의 연속된 깊이 탐지 결과가 동일한 경우.

 모든 다른 결과는 쓰레기나 잔해라고 판단해, "No Fish"라 칭할 것입니다.

당신의 목표는 깊이 탐지 결과를 나타내는 수열을 입력 받아 알람을 울릴지 말지 판단하는 것입니다.

입력
깊이 탐지 결과를 나타내는 네 정수가 입력됩니다. 각 정수마다 각각 하나의 줄에 주어집니다.

출력
가능한 네 가지 출력이 있습니다. 깊이 탐지 결과가 증가하고 있다면, Fish Rising을 출력합니다. 
깊이 탐지 결과가 감소하고 있다면, Fish Diving을 출력합니다. 
깊이 탐지 결과가 동일하다면, Fish At Constant Depth를 출력합니다. 
그 외의 경우, No Fish를 출력합니다.
 */
import java.io.*;
public class a_6764 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int result = 1;
        if (n > m) result = 2;
        else if (n == m) result = 3;
        for (int i = 1; i < 3; i++){
            n = m;
            m = Integer.parseInt(br.readLine());
            if ((result == 1 && n >= m) || (result == 2 && n <= m) || (result == 3 && n != m)) result = 4;
        }
        if (result == 1) System.out.println("Fish Rising");
        else if (result == 2) System.out.println("Fish Diving");
        else if (result == 3) System.out.println("Fish At Constant Depth");
        else System.out.println("No Fish");
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_6764().run();
    }
}
