import java.io.*;
import java.util.StringTokenizer;
public class a_17488 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    public void run() throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        // 학생 장바구니 배열 생성
        String[] first = new String[n];
        // 결과 저장 배열 생성
        String[] result = new String[n];
        // 수강신청제한인원 배열 생성
        int[] total = new int[m];
        // 배열에 수강제한인원, 1차 수강 장바구니 데이터 입력 (2 ~ n개)
        st = new StringTokenizer(br.readLine()); 
        for (int i = 0; i < n; i++) {
            total[i] = Integer.parseInt(st.nextToken());
            first[i] = br.readLine();
        }
        // 1차 수강 장바구니 데이터 배열을 수강제한인원 배열과 합침.
        applyCount(m, n, first, total, result);

        // 배열에 2차 수강 장바구니 데이터 입력 (n+1 ~ 2n개)
        String[] second = new String[n];
        for (int i = 0; i < n; i++) second[i] = br.readLine();

        // 2차 수강 장바구니 데이터 배열을 수강제한인원 배열과 합침.
        applyCount2(m, n, second, total, result);

        // total 배열 데이터와 입력 받은 배열의 데이터 비교
        // total이 0 이상이더라도 second 배열의 값이 -1이면 
        for (int i = 0; i < m; i++){
            int index = 0;
            if (total[i] >= 0){
                for (int j = 0; j < n; j++){
                    if (Integer.parseInt(first[j].substring(index)) == i + 1 || Integer.parseInt(second[j].substring(index)) == i + 1) result[j] += (i + 1) + " ";
                }
            }

        }
    }
    public void applyCount(int m, int n, String[] arr, int[] total, String[] result){
        // 값 계산 (total 배열 특정 인덱스의 값이 음수가 되면 해당 과목 수강 제한으로)
        for (int i = 0; i < m; i++){
            int index = 0;
            while (!(arr[i].substring(index - 2, index).equals("-1"))){
                total[Integer.parseInt(arr[i].substring(index))]--;
                index += 2;
            }
        }
    }

    public void applyCount2(int m, int n, String[] arr, int[] total, String[] result){
        for (int i = 0; i < m; i++){
            int index = 0;
            // total 배열 데이터 값이 0보다 작거나 같을 경우 second 배열에 -1을 입력
            if (total[i] <= 0) {
                st = new StringTokenizer(arr[i]);
                while (st.hasMoreTokens()) {
                    if (index == Integer.parseInt(st.nextToken()) - 1) sb.append("-1");
                    else sb.append(st.nextToken());
                    sb.append(" ");
                    arr[i] = sb.toString();
                }
            } else {
                while (!(arr[i].substring(index - 2, index).equals("-1"))){
                    st = new StringTokenizer(arr[i]);
                    if (index == Integer.parseInt(st.nextToken()) - 1) total[index]--;
                    index++;
                }
            }
        }
    }

    public void resultCount(String sen, int[] total){
    
    }

    public static void main(String[] args) throws IOException{
        new a_17488().run();
    }
}

/*
        for (int j = 0; j < m; j++){
            int index = 0;
            int i = 0, result_index = 0;
            while (!(arr[j].substring(index - 2, index).equals("-1"))){
                if (Integer.parseInt(arr[j].substring(index)) == total[i])
                index += 2;
                i++;
            }
        }
 */

/*
 - 장바구니는 1차, 2차
    - 기간 안에 장바구니 담기 가능
    - 1차 장바구니 기간 종료되면, 수강제한인원 초과되지 않는 한 수강 신청.
    - 2차 장바구니의 수강제한인원은 1차 장바구니의 수강등록이 완료된 후 남는 자리
    - 장바구니는 종료되어도 초기화 되지 않음.

 Q. 학생별로 장바구니를 통해 신청 성공한 과목 개수 출력.
    --- INPUT ---
        - 학생 N명
        - M개 과목의 장바구니에 참여.
        - 1차, 2차 장바구니에 담은 과목들.

    =>  1. N M
        2. M개의 과목들에 대한 수강제한인원이 공백을 기준으로 입력.
        3 ~ N. N명의 학생들이 1차 장바구니에 넣은 과목. 
        N+1 ~ 2N. 2차 장바구니에 넣은 과목들

        - 3 ~ 2N의 각 줄 끝에는 -1이 입력되며, 한 학생이 같은 과목 중복해서 담지 않음.
    
    --- OUTPUT ---
        - 1 ~ N. 1 ~ N번의 학생들을 순서대로 수강등록에 성공한 과목을 공백으로 구분해 한줄씩 출력. 오름차순.
        - 성공 과목이 없을 경우 "망했어요" 출력.
 */
