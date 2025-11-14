/*
문제

영화 '매그니피센트 7'은 서부극의 고전이 됐다. 올해 우리에게는 UCF 프로그래밍 팀을 훈련하는 10명의 코치가 있습니다. 
일단 그들을 만나보면 그들이 "마제스틱 10"이라고 불리는 이유를 알게 될 것입니다! 숫자 10은 사실 여러 면에서 특별합니다. 
예를 들어, 농구에서는 다양한 통계(득점, 리바운드 등)를 추적하고 특정 통계에서 선수가 10+(10 이상)이면 이를 더블이라고 부릅니다.
농구 선수에 대한 세 가지 통계가 주어지면 플레이어가 얼마나 많은 더블을 가지고 있는지, 즉 얼마나 많은 통계가 10보다 크거나 같은지 결정해야 합니다.

입력

첫째 줄에 플레이어 수를 나타내는 양의 정수 n이 주어집니다. 
다음 n개의 줄에 플레이어에 대한 세 가지 통계를 제공하는 0 이상 100 이하의 세 개의 정수가 공백으로 구분되어 주어집니다.

출력

우선 입력에 주어지는 통계를 출력합니다. 그 후, 더블에 대한 메시지를 출력합니다.

세 통계 중 어느 것도 10보다 크거나 같지 않으면 zilch를 출력
세 통계 중 하나가 10보다 크거나 같으면 double을 출력
세 통계 중 두 통계가 10보다 크거나 같으면 double-double을 출력
세 통계가 모두 10보다 크거나 같으면 triple-double을 출력
각 플레이어의 출력 뒤에 빈 줄을 출력합니다.
 */
import java.io.*;
import java.util.StringTokenizer;
public class a_25893 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String sen = br.readLine();
            StringTokenizer st = new StringTokenizer(sen);
            int count = 0;
            while (st.hasMoreTokens() == true){
                int num = Integer.parseInt(st.nextToken());
                if (num >= 10) count++;
            }
            sb.append(sen + "\n");
            switch (count){
                case 0 : 
                    sb.append("zilch\n");
                    break;
                case 1 :
                    sb.append("double\n");
                    break;
                case 2 :
                    sb.append("double-double\n");
                    break;
                case 3 : 
                    sb.append("triple-double\n");
                    break;
                default : 
                    break;
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_25893().run();
    }
}
