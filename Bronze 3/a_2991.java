import java.io.*;
import java.util.StringTokenizer;
public class a_2991 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dog = new int[4];
        for (int i = 0; i < 4; i++) dog[i] = Integer.parseInt(st.nextToken());
        StringTokenizer ast = new StringTokenizer(br.readLine());
        int[] hum = new int[3];
        for (int i = 0; i < 3; i++) hum[i] = Integer.parseInt(ast.nextToken());
        int index = 0;
        while (index < 3){
            int count = 0;
            int result = hum[index] % (dog[0] + dog[1]);
            count += compareDog(result, dog[0], dog[1]);
            System.out.println(index + " : " + result + " = " + count);
            result = hum[index] % (dog[2] + dog[3]);

            count += compareDog(result, dog[2], dog[3]);
            System.out.println(index + " : " + result + " = " + count);
            sb.append(count + "\n");
            index++;
        }
        System.out.print(sb);
        br.close();
    }

    public int compareDog(int result, int a, int b){
        if (result == 0 || result > a) return 0;
        else return 1;
    }

    public static void main(String[] args) throws IOException{
        new a_2991().run();
    }
}

/* ((hum[0] / dog[0]) % dog[0] == 1 ? 1 : 2)
 - 1번
    - A분동안 공격
    - B분동안 침묵

 - 2번
    - C분동안 공격
    - D분동안 침묵

 - 모든 도착 시간은 아침이 시작하고 나서.
 P : 우체부의 도착 시간
 M : 우유배달원 "
 N : 신문배달원 "

 - 매일 아침 시작 시간 = 0

 if)
 => 2 2 3 3
 => 1 3 4

 - 1번
    - 2분동안 공격
    - 2분동안 침묵

 - 2번
    - 3분동안 공격
    - 3분동안 침묵

=> 2마리의 개 모두 0에서 동시에 공격부터 시작.

 - 우체부의 도착 시간 : 1분
 - 우유배달원 " : 3분
 - 신문배달원 " : 4분

 => 우체부 = 2마리의 개
 => 우유배달원 = 1마리의 개
 => 신문배달원 = 0마리의 개
*/