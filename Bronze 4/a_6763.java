/*
문제
이제 많은 지역에 차가 보다 천천히 달리기 바라는 마음으로 운전자에게 차량 속도를 보여주는 레이더 신호가 있습니다.
당신은 레이더 신호에 메시지를 출력해야 합니다. 
메시지는 운전자에게 운전자가 모는 차의 속도에 따라 아래의 표와 같은 정보를 보여줍니다:
 - 제한 속도보다 1~20km/h 빠르면 100$
 - 제한 속도보다 21~30km/h 빠르면 270$
 - 제한 속도보다 31km/h 이상 빠르면 500$

입력
입력은 두 정수입니다. 첫 줄 입력은 제한 속도입니다. 둘째 줄 입력은 기록된 차의 속도입니다.

출력
차가 속도 위반을 하지 않는다면 출력은 아래와 같습니다 : Congratulations, you are within the speed limit!
차가 속도 위반을 하고 있다면, 출력은 아래와 같습니다 : You are speeding and your fine is $F.
F는 표에 제시된 벌금의 양입니다.
 */

import java.io.*;
public class a_6763{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int gap = c - l;
        int price = 0;
        if (gap >= 1){
            if (gap >= 1 && gap <= 20) price = 100;  
            else if (gap >= 21 && gap <= 30) price = 270;
            else if (gap >= 31) price = 500;
            System.out.printf("You are speeding and your fine is $%d.", price);
        } else System.out.println("Congratulations, you are within the speed limit!");
        br.close();
    }
}