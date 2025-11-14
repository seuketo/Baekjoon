// 다른 사람 코드를 바탕으로 작성함. 유니코드도 아스키코드와 마찬가지로 코드에 패턴이 존재하는 것을 확인했고, 이를 바탕으로 구현한 코드임. 
// 코드 길이도 짧을 뿐더러 메모리와 시간 효율도 좋아서 해당 문제에 한해선 최적의 코드로 보는게 맞을듯. 
import java.io.*;
public class a_11282{
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        sb.append((char) (Integer.parseInt(br.readLine()) + 44031));
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception {
        new a_11282().run();
    }
}

/* 1차 시도 때 정답 처리된 코드 (코드 길이에 비해 메모리와 시간 효율은 좋은편)
import java.io.*;
public class a_11282 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception{
        final int HANGUL_START_UNICODE = 44032;
        // 초성, 중성, 종성 개수
        final int JUNGSUNG_COUNT = 21;
        final int JONGSUNG_COUNT = 28;
            // 입력값 받기
        int n = Integer.parseInt(br.readLine());
        // 입력된 숫자에 해당하는 초성, 중성, 종성의 인덱스 계산
        int chosungIndex = (n - 1) / (JUNGSUNG_COUNT * JONGSUNG_COUNT);
        int jungsungIndex = ((n - 1) % (JUNGSUNG_COUNT * JONGSUNG_COUNT)) / JONGSUNG_COUNT;
        int jongsungIndex = ((n - 1) % (JUNGSUNG_COUNT * JONGSUNG_COUNT)) % JONGSUNG_COUNT;
        
        /*
        만약 n == 11172라면,
        chosungindex = 11171 / 588 = 18
        jungsungindex = (11171 % 588) / 28 = 20
        jongsungindex = (11171 % 588) % 28 = 27

        - 어떤 한글 글자의 십진수 유니코드 = [{(초성)×588}+{(중성)×28}+(종성)]+44032
            => unicode = 44032 + (18 * 588) + (20 * 28) + 27 = 55203
        55203 / 16 = 3450   ... 3 (3)
        3450 / 16 = 215     ... 10 (A)
        215 / 16 = 13       ... 7 (7)
        13 / 16 = 0         ... 13 (D)
        => 0xD7A3 == "힣" == 55203

        참조 : https://namu.wiki/w/%ED%98%84%EB%8C%80%20%ED%95%9C%EA%B8%80%EC%9D%98%20%EB%AA%A8%EB%93%A0%20%EA%B8%80%EC%9E%90/%EC%9C%A0%EB%8B%88%EC%BD%94%EB%93%9C
        */
/*
        // 초성, 중성, 종성의 유니코드 값 계산
        int unicode = HANGUL_START_UNICODE + (chosungIndex * JUNGSUNG_COUNT * JONGSUNG_COUNT) +
                    (jungsungIndex * JONGSUNG_COUNT) + jongsungIndex;

        // 해당하는 한글 음절 출력
        System.out.println(Character.toString((char) unicode));
    }
    public static void main(String[] args) throws Exception{
        new a_11282().run();
    }
}
*/