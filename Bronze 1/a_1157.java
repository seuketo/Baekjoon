import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class a_1157{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        String[] arr = ((br.readLine()).toUpperCase()).split("");
        for (String a : arr){
            if (hm.containsKey(a) == true){
                int i = hm.get(a);
                hm.put(a, i + 1);
                continue;
            }
            hm.put(a, 1);
        }

        int max = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : hm.entrySet()){
            for (Map.Entry<String, Integer> i : hm.entrySet()){
                if (i.getValue() > max) max = i.getValue();
            }
            if (entry.getValue() >= max) sb.append(entry.getKey() + " ");
        }
        String a = sb.toString();
        String[] arr2 = (sb.toString()).split(" ");
        if (arr2.length == 1) System.out.println(a);
        else System.out.println("?");
        br.close();
    }
}
/*public class a_1157{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    }
}*/
/*
import java.util.Locale;                                                        <- 왜 쓰는지 의문
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                    // 스캐너 객체 선언
        String str = sc.next();                                                 // 공백 없는 문자열 입력 = str
        String upStr = str.toUpperCase();                                       // 해당 문자열 대문자로 변환 = upStr
        String[] strArray = new String[str.length()];                           // strArray[str 길이] 문자열 배열 선언
        int[] alphabetArray = new int[26];                                      // int[a ~ z (26개)] 정수형 배열 선언
        int result = -1;                                                        // 횟수 비교용
        int count = -1;                                                         // 횟수 저장용
        int same = 0;                                                           // 동일한 빈도를 가진 문자열 갯수?
        String resultStirng = "";                                               // 최빈도 문자열 저장용


        for (int i = 0; i < str.length(); i++) {                                
            alphabetArray[(int) (upStr.charAt(i)) - 65]++;                      // 대문자(upStr)를 아스키 코드를 바탕으로 변환한 값 65 ~ 90에서 -65를 계산해서 나온 수의 인덱스 값에 +1
        }
        for (int i = 0; i < 26; i++) {                                          // 26개의 알파벳 종류(alphabetArray 길이)만큼 반복문
            if (alphabetArray[i] > result) {                                    // i에 해당하는 인덱스의 값이 result보다 크다면
                result = (alphabetArray[i]);                                    // result를 해당 인덱스 값으로 저장 (해당 배열 중에서 가장 큰 값을 찾기 위함)
                count = i;                                                      // count를 인덱스로 저장 (가장 큰 값의 위치 저장)
            }
        }
        for (int i = 0; i < 26; i++) {
            if (result == alphabetArray[i]) {                                   // 해당 인덱스 값과 result가 동일하다면
                same++;                                                         // same 값을 하나 증가 (same 값이 2개 이상일 경우 ? 출력)
            }
        }

        resultStirng = String.valueOf((char) (count + 65));                     // 아스키 코드를 바탕으로 숫자로 바꿔놓았던 것을 다시 문자로 변환해서 resultString에 저장

        if (same > 1) {                                                         // same이 1보다 크면 ? 출력
            System.out.println("?");
        } else {                                                                // 그 외의 경우는 저장한 resultString 출력
            System.out.println(resultStirng);
        }

    }
}
*/

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();                                   // 위 코드와 달리 입력 받는 즉시 대문자로 변환
		char[] arr = str.toCharArray();                                         // 문자형 배열에 입력 받은 값을 배열로 변환하여 저장
		
		int[] count = new int[26];                                              // 알파벳 종류 갯수만큼 배열 크기로 만들어 정수형 배열 선언
		for(int i=0;i<arr.length;i++) {                                        
			count[arr[i]-65]+=1;                                                // 똑같이 아스키 코드를 바탕으로 숫자로 변환하여 -65를 계산한 결과 값을 인덱스로 하여 해당 인덱스에 + 1
		}
		
		int max = -1;                                                           // 이건 사바사일듯, Integer.MIN_VALUE 써도 되지만 해당 문제에서는 0 미만이라면 그냥 쓰는 게 좀 더 효율적일것 같음.
		char ch = '?';                                                          // 조금 다른 점은 아예 char에다가 저장할 값을 넣어놓는다는 것. (2개 이상일 경우 ?를 저장, 그 외에는 결과가 될 문자를 저장)
		for(int i=0;i<26;i++) {
			if(max<count[i]) {
				max = count[i];
				ch = (char)(i+65);
			}else if(max==count[i]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
	
	}
}
 */