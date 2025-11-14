// wait

import java.util.Scanner;

public class a_1032_before {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());                    // 입력 받고자 하는 문자열 갯수가 몇 개인지 입력 받을 수 있도록 변수 n 생성.
        if (n > 50){
            System.out.println("길이 초과");
        } 
        
        else{
            String[] input_list = new String[n];                    // 동적 변수인 n에 맞춰야 하기에, 문자열 입력을 받아서 저장하는 것을 변수가 아닌 배열로 함. input_list
            input_list[0] = sc.nextLine();                          // 맨 처음 인덱스(0)은 입력값을 찾아준다. (이는 하단의 for문과 합쳐져도 별 상관이 없음. 확인을 위해서 이렇게 초기화.)
            for (int i = 1; i < n; i++){                            // i = 0, 1, 2, 3
                System.out.println(i);
                input_list[i] = sc.nextLine();                      // 배열 인덱스가 끝에 도달하기 전까지 하나씩 scanner로 입력 받아 저장.
            }
            
            int x = 1;                                              // 배열 인덱스를 while 문에서 효과적으로 접근할 수 있도록 인덱스 값 저장 변수 x 생성, 초기화.
            arr compare = new arr(input_list[0], input_list[x]);    // arr 객체 생성.
            String[] comparing = compare.CompareStr();              // 하단의 while 반복문에서 인식할 수 있도록 0번째 인덱스와 1번째 인덱스를 바탕으로 comparing 문자열 배열 생성.
            while(x < n){                                           // x가 n보다 작을 때,
                if(comparing[0].equals("0")){                   // 만약 comparing 배열의 0번째 인덱스 값이 "0"이라면,
                    break;                                                  // 반복문에서 벗어남. (이 코드는 입력받은 문자열에서 입력되면 안되는 문자가 포함되었는지 확인하기 위함. arr 객체의 check 함수 참조.)
                }
                x++;                                                // x값 증가. 예상하는 값의 수보다 더 나온다면 이 부분을 수정해보는 것을 제안.
                compare = new arr(comparing, input_list[x]);        // compare를 다른 생성자를 이용하여 값 변경.
                comparing = compare.CompareStr2(comparing);         // comparing 값 재설정.
            }
            if (comparing[0].equals("0")){                 // 만약 comparing 배열의 0번째 인덱스 값이 "0"이라면,
                System.out.println("포함할 수 없는 문자가 있습니다.");  // "포함할 수 없는 문자가 있습니다." 출력
            }
            else{                                                   // else
                String recompare = "";                                  // recompare 변수 생성, 초기화. 
                for (int i = 0; i < comparing.length; i++){             
                    recompare += comparing[i];                          // recompare에 comparing 배열의 인덱스 속 데이터를 하나하나 불러와서 합침.
                }
                System.out.println(recompare);                          // recompare 출력 (결과물)
            }
        }

        sc.close();

        
    }
}

class arr{
    String[] a;                                                     // arr, CompareStr
    String[] b;                                                     // arr, CompareStr, CompareStr2, CompareStr3
    String[] comparing;                                             // arr, CompareStr2, CompareStr3
    
    arr(String compare1, String compare2){                          // 맨 처음에 사용할 용도의 생성자
        a = compare1.split("");                               // split
        b = compare2.split("");                               // split
    }

    arr(String[] comparing, String compare){                        // 이후 계속 사용할 용도의 생성자
        this.comparing = comparing;                                 // comparing 동기화
        b = compare.split("");                                // split
    }

    String[] CompareStr(){
        String[] boo = new String[1];                               // 포함 불가 문자 확인용 String 배열 boo 생성
        if (check(a) == false || check(b) == false){                // 만약 check(a)의 반환값이 false 또는 check(b)의 반환값이 false라면
            boo[0] = "0";                                               // boo의 0번째 인덱스에 "0" 저장
            return boo;                                                 // boo 배열 반환
        };
        String[] recompare = new String[a.length];                  // 반환값 recompare 배열 생성. a 배열의 길이와 b 배열의 길이가 동일하다고 판단 -> 둘 중 아무거나 길이 넣었음.
        for(int i = 0; i < a.length; i++){
            if(a[i].equals(b[i])){                                  // a[i] 값이 b[i] 값과 동일하면
                recompare[i] = a[i];                                    // 해당 값을 그대로 recompare 배열의 i번째 인덱스에 저장.
            } else{                                                 // 반대의 경우엔
                recompare[i] = "?";                                     // recompare 배열의 i번째 인덱스에 ?를 저장.
            }
        }
        
        return recompare;                                           // recompare 반환.
    }

    String[] CompareStr2(String[] comparing){
        String[] boo = new String[1];
        if (check(comparing) == false || check(b) == false){
            boo[0] = "0";
            return boo;
        };
        String[] recompare = new String[comparing.length];
        for(int i = 0; i < comparing.length; i++){
            if (i == comparing.length - 1){
                recompare[i] = CompareStr3(i, comparing[i]);
                return recompare;
            }
            
            if(comparing[i].equals(b[i])){
                recompare[i] = comparing[i];
            } else{
                recompare[i] = "?";
            }
        }
        
        return recompare;
    }

    String CompareStr3(int i, String comparing){
        if(comparing.equals(b[i])){
            return comparing;
        }
        return "?";
    }


    boolean check(String[] compare){
        for (int i = 0; i < compare.length; i++){
            if (compare[i].equals("!_@#$%^&*(),<>/")){
                return false;
            }
        }

        return true;
    }
}


// String으로 어차피 받을거라서 딱히 상관 쓸 필요는 없어보이는데 다만 고려하는데 있어 가장 힘든 점은 50개보다 작거나 같은 수라는 것. 
// String 변수를 50개까지 일일이 써서 할 수 없는 노릇이기 때문에 이에 대해선 좀 봐야할 필요가 있다.
// 객체에다가 따로 저장하는 방법도 생각했지만 그걸 한다고 해서 달라지는 점이 없다. 변수의 이름에 숫자를 넣어서 그걸 1씩 증가시킴으로써 잡을 수 있는게 아니라면 도통 생각나는게 딱히 없다.
// String 배열에다가 저장하고, 이걸 또 나누는 방법은 없을까?
// String을 받는 즉시 배열에다가 저장하고 다음 String을 입력 받는 방법이라면 입력 부분은 어떻게든 해결해볼 수 있다. 그 이후에 String을 분리하고, 그걸 비교하는 부분의 문제만 잡으면 코드를 완성시킬 수 있다.


// 2024-02-16
// 코드를 완성시켰고, 실행시켰지만 out of bounds 발생. 13번 라인과 Compare 함수들에서 범위 초과가 발생한 것 같다.
// 정확히 어떤 것이 원인인지 확인할 수가 없어서 보류, 다른 문제로 넘어간다.
// 해당 코드의 설명은 코드 옆에 따로 기록한 것을 참고.