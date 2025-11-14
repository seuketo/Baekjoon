// Clear
import java.util.Scanner;

public class a_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}

// 339 Byte
// 크기 측면에서 우세
// 적은 용량의 입력에서 사용해야 효율 극대화