/*
문제

소 베시는 우유 생산 산업에 종사하는 것도 지쳐, 컴퓨터 관련 흥미로운 커리어를 새로 시작하려 합니다. 
코딩 실력을 늘리기 위해, 베시는 온라인 USACO 대회에 참가하기로 했습니다. 
대회가 2011년 11월 11일(11/11/11)에 시작한다는 것을 알게 돼, 베시는 재미 삼아 11/11/11 오전 11:11에 문제를 다운로드 받아 코딩을 시작하기로 했습니다.

안타깝게도 베시는 시간 관리를 잘하는 편이 아니라, 대회 시간 제한인 3시간(180분)을 넘기지 않도록 도와주는 프로그램을 빠르게 작성하려 합니다. 
날짜와 베시가 대회를 마친 시간이 주어질 때, 베시를 도와 그녀가 대회에 투자한 시간을 분으로 계산합시다.

입력 

첫째 줄: 베시가 대회를 마치는 시간을 나타낸 세 정수 D H M이 공백으로 나뉘어 주어집니다. 
D는 날짜의 일을 나타내는 11~14 사이의 정수이며, H와 M은 24시간 단위 기준으로 날짜의 시간과 분을 나타냅니다. (따라서 범위는 자정인 H = 0, M = 0부터 오후 11시 59분을 나타내는 H = 23, M = 59까지입니다.)

출력

첫째 줄: 베시가 대회에 투자한 총 시간을 분으로 출력하거나, 끝나는 시간이 시작 시간보다 빠르다면 -1을 출력합니다.
 */
import java.io.*;
import java.util.StringTokenizer;
public class a_5928 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (D >= 11 && D <= 14){
            if (D == 11 && H >= 11 && H <= 24){
                if (H == 11 && M >= 11 && M <= 59){
                    System.out.println(M - 11);
                } else if (H == 11 && M < 11) System.out.println(-1);
                else if (H == 11 && M >= 60) System.out.println()
            } else if (D == 11 && H > 24){
                if (M >= 11) {
                
                } else System.out.println(-1);
            }
            else System.out.println(-1);
        } else System.out.println(-1);
    }
}
