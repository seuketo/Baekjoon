/*
문제
Ron은 다양한 고추를 사용하여 칠리를 요리하고 있습니다.
고추의 매운 정도는 스코빌 열량 단위(SHU)로 측정됩니다. 
Ron의 칠리는 현재 전혀 맵지 않지만 Ron이 고추를 추가할 때마다 칠리의 총 매운맛은 해당 고추의 SHU 값만큼 증가합니다.
Ron이 사용할 수 있는 고추의 SHU 값은 다음 표에 나와 있습니다.

고추 이름   Scolville Heat Units
포블라노    1500
미라솔      6000
세라노      15500
카이엔      40000
태국인      75000
하바네로    125000

당신의 임무는 Ron이 고추 추가를 마친 후 고추의 전체 매운 정도를 결정하는 것입니다.

입력
입력의 첫 번째 줄에는 양의 정수가 포함됩니다.
N는 Ron이 칠리에 추가하는 고추의 수를 나타냅니다. 다음 N줄에는 Ron이 추가한 고추의 이름이 각각 포함됩니다. 
각 고추 이름은 위 표에 표시된 이름과 정확히 일치합니다. 같은 이름의 고추를 두 개 이상 추가할 수 있다는 점에 유의하세요.

출력
출력은 양의 정수로 구성됩니다.
T는 론 칠리의 총 매운맛을 나타냅니다.
 */
import java.io.*;
public class a_28249{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++){
            String sen = br.readLine();
            if (sen.equals("Poblano")) sum += 1500;
            else if (sen.equals("Mirasol")) sum += 6000;
            else if (sen.equals("Serrano")) sum += 15500;
            else if (sen.equals("Cayenne")) sum += 40000;
            else if (sen.equals("Thai")) sum += 75000;
            else sum += 125000;
        }
        System.out.println(sum);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_28249().run();
    }
}