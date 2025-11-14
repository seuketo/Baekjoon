// Clear
import java.util.Scanner;
import java.math.BigInteger;

public class a_1271{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger getMoney = sc.nextBigInteger();
        BigInteger giveMoney = sc.nextBigInteger();

        System.out.println(getMoney.divide(giveMoney));                     // 나누기
        System.out.println(getMoney.remainder(giveMoney));                  // 나머지

        sc.close();
    }
}


// BigInteger 라는 자료형을 처음 알았다. 계산 방법 또한 완전 달라서 이건 좀 신선한 문제였다.
// 문제에 적힌 값의 범위가 10^1000 으로, 거의 무한대에 가까운 수이기 때문에 int와 long으로는 감당할 수 없는 값이였다.
// 이에 BigInteger를 사용했다. (BigInteger는 무한대에 가까운 수도 계산이 가능함.)
// 더하기, 빼기, 나누기, 곱하기와 같은 간단한 연산도 함수를 따로 사용해야만 한다. 함수의 종류는 다음과 같다.
/*
-------------------------------------------------------------------------------------------------
더하기  : add()
빼기    : substract()
곱하기  : multiply()
나누기  : divide()
나머지  : remainder()
-------------------------------------------------------------------------------------------------
*/
//   자료형    |        패키지         |     Scanner
// BigInteger  | java.lang.BigInteger | .nextBigInteger()

// Refer to : https://tooo1.tistory.com/2


