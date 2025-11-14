/*
문제

선장 잭은 라이벌의 배를 점령하기로 결정했고, 그러기 위해서는 정원 6명인 배에 해적 부하들을 각각 태워 보내야 합니다. 당신은 6명씩 그룹을 지어 해적을 세는 것을 도울 것입니다. 
마지막으로 출발하는 배는 정원이 다 차지 않아도 출발할 수 있습니다. 당신의 임무를 쉽게 하기 위해 각 해적은 1부터 N 까지의 숫자를 할당 받았습니다.

입력

배를 태워 보내야하는 해적의 수 N 이 입력으로 주어집니다.

출력

출력은 공백으로 구분된 각 해적의 숫자가 되며, 배가 출발하는 시점에 "Go!"라는 단어를 출력하여 표시합니다.
*/
import java.io.*;
public class a_5300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++){
            str.append(i + " ");
            if (i % 6 == 0 || i == N){
                str.append("Go! ");
            }
        }
        System.out.println(str);
        br.close();
    }
}
// StringBuilder를 굳이 써야하는 이유를 솔직히 말해서 잘 모르겠음.
// 해당 문제에서 요구했었던 것은 print를 이용해서 반복문이 한번씩 돌아갈 때마다 print로 출력되는 것이 아닌 StringBuilder를 이용하여 출력 데이터를 쌓아 한번에 출력시키고자 하려고 한 듯. 
// 해당 문제로 인해 범위 문제 외의 "틀렸습니다" 발생 경우에 StringBuilder 또한 고려해야함을 인지.