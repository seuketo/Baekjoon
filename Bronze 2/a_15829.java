import java.io.*;

public class a_15829 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws IOException{
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();
        long M = 1234567891;
        long sum = 0;
        long pow = 1;
        for (int i = 0; i < L; i++){
            int num = input.charAt(i) - 'a' + 1;
            sum = (sum + num * pow) % M;
            pow = (pow * 31) % M;
        }
        System.out.println(sum);
        br.close();
    }   
    public static void main(String[] args) throws IOException{
        try{
            new a_15829().run();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}


/*
 - 영어에는 총 26개의 알파벳이 있기에, 각 알파벳마다 고유번호를 매길 수 있음.
    - a = 1
    - b = 2
    - c = 3 
    - ...

 - 이를 수열로 표현할 수도 있다. 예를 들어 'abba'의 경우 1221로 표현 가능하다는 것.
 - 처음 해시 함수로 했을 경우, (1 + 2 + 2 + 1) % M = H라는 것인데, 이는 알파벳 배열이 달라져도 동일한 출력값을 가지기 때문에 나쁜 해시 함수.
 - 그래서 수정한 해시 함수는 각 자리마다 다른 고유 계수를 곱해서 더하는 방법이 있다. 
    - 첫번째 항에는 r, 두번째 항에는 r^2, 세번째 항에는 r^3, 네번째 항에는 r^4의 고유 계수를 지정한다면
    - ((1 * r^0) + (2 * r^1) + (2 * r^2) + (1 * r^3)) % M = H라는 식이 생긴다.
    - 이는 알파벳 배열이 달라져도 고유 계수가 있기 때문에 각각 다른 출력값을 가지게 됨.

 - 고유 계수(r)와 M의 값은 서로소임.
    - r의 값은 26보다 큰 소수인 31
    - M의 값은 1234567891로 지정(소수)


 * 모듈러 계산할 떄, 다음과 같은 식의 경우 주의할 점이 있음.
    1. sum 부분을 보면 sum += 이 아닌 sum = sum + 이런 식으로 전개됨. 이는 문제에서 알다시피 모든 값을 계산하고 마지막에 mod M이 들어가있음.
       온전한 식을 보면 ((1 * r0) + (2 * r1) + (3 * r2) + (4 * r3) + (5 * r4)) mod M임.
       이는 (((1 * r0) % mod M) + ((2 * r1) mod M) + ((3 * r2) mod M) + ((4 * r3) mod M) + ((5 * r4) mod M))) % mod M과 동일.
       이를 이해하기 쉽게 설명한다면 (a + b) mod M = ((a mod M) + (b mod M)) mod M임.
       예시를 들었을 때, (17 + 23) mod 5의 경우, 40 % 5 = 0, (((17 % 5 == 2) + (23 % 5 == 3)) == 5) % 5 = 0으로 동일한 나머지를 가짐.
       결국 모든 값에서 mod M을 해서 나온 나머지를 모두 더하고, 이를 다시 mod 5를 한 것이 동일한 값을 가진다는 것.
       근본적으로 hash값은 현재 가지는 air^i를 제외한 나머지(limit k = 0 ~ i-1 akr^k % mod M)를 모두 계산한 값이라는 것.
       그렇게 됐을 때 현재 sum에 나오는 식은 따지고 보면 limit k = 0 ~ 현재 index akr^k % mod M 이랑 동일.
       limit ... 를 S로 가정했을 때, S0이 초기식, S2는 ((S0 mod M) + (S1 mod M) + air^i) mod M 이는 (sum + air^i) mod M이라는 것.
       펼쳤을 땐 (sum(S0 + S1) + ai * r^i) mod M이라는 것이다.
       어차피 M보다 큰 수가 아닌 한, mod M을 여러번 돌려도 그 값은 동일한 것을 볼 수 있기 때문에 수의 크기 조절을 위해 pow 부분에 mod M을 한번 더 한 것이다.

       

 */