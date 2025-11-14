// hard
import java.io.*;
import java.util.StringTokenizer;
// import java.math.BigInteger;

/*public class a_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sen = br.readLine();
        StringTokenizer st = new StringTokenizer(sen);

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        BigInteger C = new BigInteger(st.nextToken());
        BigInteger D = new BigInteger(br.readLine());
        BigInteger one = new BigInteger("3600");
        BigInteger two = new BigInteger("60");
        BigInteger three = new BigInteger("24");


        BigInteger Dh = D.divide(one);
        BigInteger Dm = (D.subtract(Dh.multiply(one))).divide(two);
        BigInteger Ds = (D.subtract(Dh.multiply(one))).subtract(Dm.multiply(two));

        if ((C.add(Ds)).compareTo(two) >= 0){
            print(1, "in");
            A = A.add((C.add(Ds)).divide(one));
            B = B.add((C.add(Ds)).remainder(one).divide(two));
            C = ((C.add(Ds)).remainder(one)).subtract(((C.add(Ds)).remainder(one).divide(two).multiply(two)));
        } else C = C.add(Ds);

        if ((B.add(Dm).compareTo(two)) >= 0){
            print(2, "in");
            A = A.add((B.add(Dm)).divide(two));
            B = (B.add(Dm)).remainder(two);
        } else B = B.add(Dm);

        if ((A.add(Dh).compareTo(three)) >= 0){
            print(3, "in");
            A = (A.add(Dh)).subtract(three);
        }
        else A = A.add(Dh);
        System.out.printf("%d %d %d", A, B, C);
        br.close();
    }

    static void print(int i, String inout){
        System.out.println(i + inout);
    }
}*/

public class a_2530{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());

        c += d;
        b += c / 60;
        c = c % 60;
        a += b / 60;
        b = b % 60;
        a = a % 24;
        System.out.printf("%d %d %d", a, b, c);
        br.close();
    }
}

// 시간 관련된 문제들에 대해서는 다시 한번 더 생각해보고, 시도해서 경험을 쌓을 필요가 있음.
// 왜냐하면 시간 문제에서 생각보다 고민하는데 시간을 많이 들이고 있고, 이에 코드를 어떻게 짜야할지에 대한 정확한 방향을 아직 찾지 못 했을 뿐 만 아니라, 경험도 부족함.
