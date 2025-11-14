import java.util.Scanner;
import java.util.StringTokenizer;

public class a_8370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sen = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sen);

        int n1 = Integer.parseInt(st.nextToken());
        int k1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int k2 = Integer.parseInt(st.nextToken());

        System.out.println((n1 * k1) + (n2 * k2));
        sc.close();
    }
}

/*
---------------------------------------------------------
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt()*sc.nextInt() + (sc.nextInt()*sc.nextInt()));
    }
}
----------------------------------------------------------
 */

// 해당 코드는 백준에서 극단적으로 코드 길이가 짧은 답안을 참조한 것이다.
// Scanner에서 nextInt()는 개행 문자(공백, \n 등)을 기준으로 하기 때문에 이와 같은 코드 구성이 가능하다.
// 다만 해당 코드는 입력할 문자의 갯수가 정해져있을 경우에만 사용이 가능하기에 만약 입력할 문자의 갯수가 정해져있지 않다면 while문과 if문을 사용하여 적절한 조절을 해야한다.