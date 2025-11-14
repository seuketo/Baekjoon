import java.io.*;
import java.util.StringTokenizer;
public class a_1547 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int m = Integer.parseInt(br.readLine());
        char[] arr = new char[3];
        int index = 0;
        arr[index] = 'o';
        arr[1] = 'x';
        arr[2] = 'x';
        for (int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == index + 1 && arr[index] == 'o') {
                arr[index] = 'x';
                index = b - 1;
            }
            else if (b == index + 1 && arr[index] == 'o'){
                arr[index] = 'x';
                index = a - 1;
            } else if ((a == index + 1 || b == index + 1) && arr[index] != 'o'){
                index = -1;
            }
            if (index != -1) arr[index] = 'o';
        }
        if (index != -1) System.out.println(index + 1);
        else System.out.println(-1);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        new a_1547().run();
    }
}

/* 14244KB, 124ms, 645B
// 코드 자체가 문제의 조건을 다 수용하진 않은 것 같음. 공이 발견되지 않을 경우가 존재하지 않을 거 같아서 사실상 문제를 이해하고 이 경우를 배제했다면 이 코드가 훨씬 효율적이긴 함.
// 다만 이 경우를 포함해야만 한다면 위의 코드가 옳다고 생각함. 코드 길이 차이가 2배 가량 존재하지만 속도나 메모리는 차이가 거의 없음.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int M = Integer.parseInt(br.readLine());
		int ball = 1;

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == ball)
				ball = b;
			else if (b == ball)
				ball = a;

		}

		System.out.println(ball);
	}

}
 */
