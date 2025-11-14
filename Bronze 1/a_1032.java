/*
import java.io.*;

public class a_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());                                    // 파일 이름의 개수 n
        String[] arr = new String[n];                                               // 입력 받은 문자열 저장용 배열
        String one = "";                                                            // 비교하기 위해 사용
        String two = "";                                                            // 비교하기 위해 사용
        String a = "";                                                              // 이전 비교 결과 저장용
        char[] one_arr = new char[50];                                              // one을 문자열 배열로 변환
        char[] two_arr = new char[50];                                              // two를 문자열 배열로 변환
        char[] res_arr = new char[50];                                              // 결과를 문자열 배열에 저장 (? 포함)
        for (int i = 0; i < n; i++) arr[i] = br.readLine();                         // 입력값 저장
        for (int i = 0; i < n; i++){
            if (i == 0){                                                            // 맨 처음에만 수행
                if (arr[i].equals(arr[i + 1])){                                         // 0번째와 1번째가 동일한 값이면
                    res_arr = one_arr;                                                      // res_arr에 one_arr을 넣어 다음 코드가 정상적으로 작동하도록 함.
                    continue;                                                               // continue;
                } else{                                                                 // 그 외엔,
                    one = arr[i];                                                       // one에 0번째 저장
                    two = arr[i + 1];                                                   // two에 1번째 저장
                }
                one_arr = one.toCharArray();                                            // one을 문자 배열로 변환
                two_arr = two.toCharArray();                                            // two를 문자 배열로 변환
                for (int j = 0; j < one_arr.length; j++){                               // 반복
                    if (one_arr[j] == (two_arr[j])) res_arr[j] = one_arr[j];                // 만약 one_arr과 two_arr이 동일하면 => 결과 배열에 one_arr의 j번째 인덱스를 집어 넣음.
                    else res_arr[j] = '?';                                                  // 아니라면 => ? 집어 넣음
                    sb.append(res_arr[j]);                                                  // sb에 동일하게 저장
                }
                a = sb.toString();                                                      // 반복문에서 저장된 sb를 toString을 사용해서 문자열로 변환
                if (n > 2){
                    sb = new StringBuilder();                                               // sb 초기화
                    i = 1;                                                                  // i = 1로 함으로써 2번째 인덱스로 연결되도록 함. 
                } else break;
            } else{                                                                 // 맨 처음을 제외하고 수행
                two = arr[i];                                                           // two에 arr[2] 넣음 => 반복문이 돌아가는 동안 1씩 인덱스 값이 올라감.
                if (a == two) continue;                                                 // 문자열 a와 two가 동일하면 넘어감.
                one_arr = res_arr;                                                      // one_arr에 이전 결과 배열 덧씌움
                two_arr = two.toCharArray();                                            // two_arr에 2번째를 문자 배열로 변환하여 저장.
                for (int j = 0; j < two_arr.length; j++){                               // 반복
                    if (one_arr[j] == (two_arr[j])) res_arr[j] = one_arr[j];                // -----------------------------------------
                    else res_arr[j] = '?';                                                  //          위와 동일하게 돌아감
                    sb.append(res_arr[j]);                                                  // -----------------------------------------
                }
                a = sb.toString();
                if (i != n - 1) sb = new StringBuilder();
            }
        }
        if (sb != null) System.out.print(sb);                                                    // sb 출력
        br.close();                                                           
    }
}
*/
/*
import java.io.*;
import java.util.Arrays;
public class a_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        String one = "";
        String two = "";
        String a = "";
        char[] one_arr = new char[50];
        char[] two_arr = new char[50];
        char[] res_arr = new char[50];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();
        for (int i = 0; i < n; i++){
            if (i == 0){
                if (n <= 1) {
                    sb.append(arr[i]);
                    break;
                }
                else{
                    if (arr[i].equals(arr[i + 1])){
                        res_arr = one_arr;
                        continue;
                    } else{
                        one = arr[i];
                        two = arr[i + 1];
                    }
                    one_arr = one.toCharArray();
                    two_arr = two.toCharArray();
                    for (int j = 0; j < one_arr.length; j++){
                        if (one_arr[j] == (two_arr[j])) res_arr[j] = one_arr[j];
                        else res_arr[j] = '?';
                        sb.append(res_arr[j]);
                    }
                    if (n > 2){
                        sb = new StringBuilder();
                        i = 1;
                    } else break;
                }
            } else{
                two = arr[i];
                if (Arrays.toString(res_arr) == two) continue;
                one_arr = res_arr;
                two_arr = two.toCharArray();
                for (int j = 0; j < two_arr.length; j++){
                    if (one_arr[j] == (two_arr[j])) res_arr[j] = one_arr[j];
                    else res_arr[j] = '?';
                    sb.append(res_arr[j]);
                }
                if (i != n - 1) sb = new StringBuilder();
            }
        }
        System.out.print(sb);
        br.close();
    }
}
*/
import java.io.*;
public class a_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        
        // 입력받은 문자열을 배열에 저장
        for (int i = 0; i < n; i++) 
            arr[i] = br.readLine();
        
        // 첫 번째 문자열을 기준으로 초기화
        char[] res_arr = arr[0].toCharArray();
        
        // 두 번째부터 입력된 문자열과 비교하여 '?' 또는 일치하는 문자를 출력
        for (int i = 1; i < n; i++) {
            char[] curr_arr = arr[i].toCharArray();
            for (int j = 0; j < res_arr.length; j++) {
                if (res_arr[j] != curr_arr[j])
                    res_arr[j] = '?';
            }
        }
        
        // 결과 배열을 StringBuilder에 추가
        for (char c : res_arr)
            sb.append(c);
        
        System.out.print(sb);
        br.close();
    }
}