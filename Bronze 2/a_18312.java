import java.io.*;
import java.util.StringTokenizer;
public class a_18312 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int count = 0;
        int type = 0;
        for (int a = 0; a <= n; a++){
            if ((k == 0 && a % 10 == 0) || a == k || (a != 0 && a % 10 == k) || (a != 0 && k != 0 && a / Integer.parseInt(Integer.toString(k) + "0") == 1)) {
                count += 3600;
                continue;
            }
            else
                for (int b = 0; b <= 59; b++){
                    if ((k == 0 && b % 10 == 0) || b == k || (b != 0 && b % 10 == k) || (b != 0 && k != 0 && b / Integer.parseInt(Integer.toString(k) + "0") == 1 && 0 <= b % Integer.parseInt(Integer.toString(k) + "0") && b % Integer.parseInt(Integer.toString(k) + "0") <= 9)) count += 60;
                    else if (k <= 5 && k >= 1) count += 15;
                    else count += 5;
                }        
        }
        System.out.println(count);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_18312().run();
    }
}

/*
 - int N:단위_시, K:포함되는 정수 (Divide by. StringTokenizer)
 - 00시 00분 00초 ~ N시 59분 59초까지 K가 하나라도 포함된 시간 모두 입력
    - 1씩 순환하는 시각은 시간 제한 범위에 위반되기에 사용 불가로 규정.
    - 0 ~ 9까지의 범위 지정이 있기 때문에 단위_시 제외 단위_분, 단위_초는 0 ~ 5까지 10의 자리와 1의 자리 둘 다 중복된다고 가정.
    - String으로 받아놓고 repeat으로 2번 반복한 수를 정수로 변환해 해당 수가 60 안에 존재하면 + 1
    - 연산자_/를 사용하면 K가 포함된 연산값 또한 1로 인식하기 때문에 사용 불가.
    - 단위_시 1의 값은 단위_분이 60, 단위_초가 00에 도달했을 때 해당 범위에 포함된 값의 양이기 때문에 (값의 양 * 단위_시 값).
 */