import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class a_8393br {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println(sum);
        br.close();
    }
}

// 486 Byte (class명을 포함)
// 속도 측면에서 우세
// 큰 용량의 입력에서 사용해야 효율 극대화