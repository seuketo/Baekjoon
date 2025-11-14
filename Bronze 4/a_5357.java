/*
문제

이 각박한 세상에서 중복은 의미가 없습니다. 그러니 중복을 모두 제거해 봅시다. 예로, AAABB는 중복 문자열입니다. AB만 사용하는 것이 났지 않나요 ? 문자열이 주어지면 연속되는 같은 글자는 모두 제거하도록 해 봅시다.

입력

입력의 첫 번째 줄은 뒤에 오는 데이터의 수를 나타내는 정수 입니다. 각 데이터는 하나의 문자열로 이루어졌으며, 문자열의 길이는 100 보다 작습니다. 각 문자열은 알파벳 대문자로만 이루어져 있습니다.

출력

중복 제거된 문자열을 출력합니다.
*/
import java.io.*;
import java.util.*;
public class a_5357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++){
            List<String> str_list = Arrays.asList((br.readLine()).split(""));
            Set<String> str_set = new HashSet<>(str_list);
            String str = "";
            for (String a : str_set) str += a;
            sb.append(str + "\n");
        }
        System.out.println(sb);
        br.close()
    }
}

// 오류 : 중복되는 문자들의 연속 중, 맨 앞의 문자는 남겨놓고 나머지 문자들을 제외하는 것인데 맨 앞의 문자를 남겨놓는 코드가 구현되지 않음.