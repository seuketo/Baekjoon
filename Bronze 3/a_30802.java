import java.io.*;
import java.util.*;
public class a_30802{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringTokenizer st2;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        long n = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        long t = Long.parseLong(st2.nextToken());
        long p = Long.parseLong(st2.nextToken());
        long sumt = 0;
        while (st.hasMoreTokens()){
            long num = Long.parseLong(st.nextToken());
            if (num % t > 0) sumt += (num / t) + 1;
            else sumt += num / t;
        }
        sb.append(sumt).append("\n");
        sb.append(n / p).append(" ").append(n % p);
        System.out.println(sb.toString());
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_30802().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 - 1인당 티셔츠 한 장, 펜 한 자루
    - 총 인원은 N명 (1 <= N <= 1,000,000,000)
    - 티셔츠 사이즈는 s, m, l, xl, xxl, xxxl, 같은 사이즈의 티셔츠만 t장 묶음으로 구매 가능. 개별로 구매 불가.
    - 펜은 한 종류, p자루씩 묶음 or 한 자루씩 구매 가능.
    - 티셔츠와 펜 둘 다 부족해서는 안 됨, 티셔츠는 넉넉해도 됨. 단, 펜은 정확히 맞춰야 함.
        - s + m + l + xl + xxl + xxl = N
        - 0보다 크거나 같고, N보다 작거나 같은 수를 가짐.
        - t와 p는 2보다 크거나 같고, 10억보다 작거나 같은 수를 가짐.
        - 구매해야 하는 티셔츠의 총량은 N과 동일하다고 생각.
        - t와 p는 입력받는 N에서 나눈다고 가정, 10억을 넘지 않는다고 생각.

@ 그럼 최대로 될 수 있는 T의 값을 알면 되지 않겠냐? 하는 것.
    - p는 T의 최대값에 맞추면 됨.
    - T가 최대가 되어야 하는 이유는 다른 모든 갯수를 포용할 수 있는 크기여야 하기 때문.
    - 결과값에 p는 어차피 총 참가자의 수만큼만 사면 됨. T가 문제.
 */

/*
if) 
N = 23
T[] = [3, 1, 4, 1, 5, 9]
T = 5
P = 7

- 사이즈별 신청자 수
    s : 3
    m : 1
    l : 4
    xl : 1
    xxl : 5
    xxxl : 9

- 5장씩 묶음으로 구매 가능하기 때문에 최소 하나씩은 구매해야 함. xxxl만 2묶음 구매.
- 연필은 7자루 묶음 or 1자루 구매 가능. 총 신청자 수가 23명이기 때문에 3묶음 + 2자루하면 갯수가 맞음.
 */