import java.io.*;
import java.util.*;
public class a_25705 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        
    }
    public static void main(String[] args) {
        try{
            new a_25705().run();
        } catch(IOException e){
            System.err.println("오류 : " + e.getMessage());
        }
    }
}


// 배열 이동시에 +1을 하는 방식으로 돌리면 충분히 가능함.
// 돌림판을 배열로 지정하고, 인덱스 숫자를 따로 하나 지정해서 ++하는 방식?
// 배열에 없는 문자가 존재하는 경우
    // for문이 별도로 필요한 조건임. 배열은 List 정도로 충분해 보임.
        // 동일한 for문에서 조건만 추가해도 괜찮을거 같음.
    // for문 반복 횟수는 만들고자 하는 문자열 길이만큼, 검색은 List.contains()로.
    // 만약 이걸로 걸러진다면 나머지 모든 과정 다 패스, 저장된 결과 다 폐기하고 -1 출력
// d -> a로 이동하는 조건이 추가되어야 함. (인덱스 값을 뽑아서 현 인덱스 숫자보다 낮은 경우, length() - (1 + 인덱스 숫자) + 인덱스 값하면 될 듯)
/*
 * 입력 : 
 *       4          => 입력해야되는 돌림판 문자 갯수
 *       abcd       => 돌림판에 적힌 문자 나열
 *       6          => 돌림판을 돌려서 만들고자 하는 문자열 길이
 *       aacdbc     => 만들고자 하는 문자열
 * 
 *          ex) 맨 처음 돌림판 문자 : 마지막으로 입력된 문자 = d
 *              d -> a(+1) -> a(+4) -> c(+2) -> d(+1) -> b(+2) -> c(+1)
 *              => 총 11
 * 
 * 출력 :
 *       11 (계산 과정에서 밝힌 결과와 동일)
 */