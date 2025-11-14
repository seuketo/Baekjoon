// Clear
// EOF(End Of File)을 고려해야 함.
import java.io.*;
import java.util.StringTokenizer;

public class a_3733 {
    public void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));       // = Scanner
        StringBuilder sb = new StringBuilder();                                         // 수정 가능한 String => 출력값을 저장할 변수 ("\n"를 포함.)
        String sen;
        while((sen = bf.readLine()) != null){
            StringTokenizer st = new StringTokenizer(sen);
            if (st.hasMoreTokens() == false){
                break;
            }
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            sb.append(s / (n + 1)).append("\n");
        }
        System.out.println(sb);
        bf.close();
    }
}
        // 백준 정답 처리
        /*
        while (true){                                                                   // EOF를 위해서 while로 break가 나오기 전까지 무한 루프
            String sen = bf.readLine();                                                 // bufferedreader로 입력 받은 값을 저장할 변수 sen
            if (sen == null) break;                                                     // sen의 입력값이 아무것도 없으면 // break
            StringTokenizer st = new StringTokenizer(sen);                              // = split() (런타임 시간 축소를 위해서 StringTokenizer 사용)
            int n = Integer.parseInt(st.nextToken());                                   // n값 int 형으로 받음                                              => 오류 발생 구간
            int s = Integer.parseInt(st.nextToken());                                   // n과 동일한 방법으로 값을 받음
            sb.append(s / (n + 1)).append("\n");                                    // StringBuilder sb에다가 몫의 값 + 뉴라인 추가
        }
        System.out.println(sb);
        bf.close();
    }
}
        */

    // 백준 정답 처리
    /*
    public static void main(String[] args) throws Exception {
        new a_3733().solution();
    }
    */

// 이 코드 컴파일러로 돌아가지 않는데 백준으로는 정답 판정 받음.
// 13번째 줄의 코드가 문제가 생겼다고 하는데 정확한 원인이 그 곳인지는 모르겠음.
// StringTokenizer로 sen의 토큰을 분해해서 n과 s에 받았는데 그게 원인일지도 모르겠음. (st.nextToken() 부분에서 nextToken이 아닌 다른 코드를 먼저 써야 하는 것일거라고 추정)
// Refer to : https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-3733-Shares-java

// 2024-02-20 
// 해당 문제를 제출하여 정답 판정 받은 이후 코드의 문제점을 분석했고 아무것도 입력하지 않은 채 엔터키를 누르면 해당 예외가 발생되는 것을 확인. 
// break가 들어있는 조건문에 문제가 있다고 생각하여 코드를 일부 수정하였음. 입력값이 null인 것이 아니라 hasMoreTokens()를 이용하여 다음 토큰이 존재하지 않으면 break를 통해 while문을 벗어나도록 작성.
// 이를 통해 컴파일러에 정상적으로 값이 출력되는 것을 확인, 문제 해결 종료.
