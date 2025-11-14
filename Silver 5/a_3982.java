/*
문제
각 팀들은 FIFA 월드컵 조별 리그를 마쳤고 16강전에 진출한 팀들이 알려져 있습니다. 
제 상사는 모든 경기를 분석하고 나머지 경기에 베팅합니다 – 각 경기의 결과를 종이 한 장에 적습니다. 
그의 베팅을 다음 베팅 사무실로 가져와 1000달러를 책정하는 것이 제 일이었습니다. 
주머니에 현금이 너무 많아서 긴장해서 넘어져서(제가 좀 서툴러요) 베팅이 흔들렸습니다. 
그래서 베팅이 결승전에 해당하는지 준결승전에 해당하는지 다른 것에 해당하는지 모르겠습니다.
저는 상사를 실망시키고 싶지 않아서 토너먼트의 승자에게 단 한 번의 내기를 걸었습니다. 
제가 아는 모든 것은 매 라운드마다 이긴 팀(상대팀보다 더 많은 골을 쏘면 이기는 팀)이 다음 라운드에 있고, 다른 팀들은 토너먼트에서 탈락한다는 것입니다. 
패자들이 3위를 놓고 경기를 하는 준결승전의 경우에는 그렇지 않습니다. 그래서 우리는 총 16경기를 치릅니다.
제 상사의 베팅에 따라 월드컵에서 어느 팀이 우승할지 알려주실 수 있나요?

입력
입력의 첫 번째 행은 테스트 케이스 c(1 ≤ c ≤ 100)의 수이다. 각 테스트 케이스는 무작위 순서로 매치를 설명하는 16개의 행으로 구성됩니다. 
매치 설명은 다음과 같습니다. 
t1과 t2는 두 팀의 팀 이름(정확하게 세 개의 대문자로 약칭됨), g1과 g2(0 ≤ g1, g2 ≤ 10; g1 ≠ g2)는 골의 갯수입니다.

출력
각 테스트 케이스마다 FIFA 월드컵 우승팀이 포함된 한 줄씩 인쇄합니다(항상 맞는 상사의 분석을 바탕으로!).
 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.List;
public class a_3982 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < 16; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String t1 = st.nextToken(), t2 = st.nextToken();
                if (!map.containsKey(t1)) map.put(t1, 0);
                if (!map.containsKey(t2)) map.put(t2, 0);
                int g1 = Integer.parseInt(st.nextToken()), g2 = Integer.parseInt(st.nextToken());
                if (g1 > g2) map.put(t1, map.get(t1) + 1);
                else map.put(t2, map.get(t2) + 1);
            }
            List<Map.Entry<String, Integer>> entrylist = new ArrayList<>(map.entrySet());
            entrylist.sort(Map.Entry.comparingByValue());
            sb.append(entrylist.get(entrylist.size() - 1).getKey() + "\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws IOException{
        new a_3982().run();
    }
}

/* 79156673, 14080KB, 108ms, 1050B

// 해당 코드에서 신기하다고 느낀 부분은 while문임. --> 이것이 '--' + '>' 2개를 합한 문자로써 사용된다는 점.
// c를 하나씩 감소시키고, 해당 값이 0보다 클 때까지만 반복된다는 의미로 사용됨. 상당히 인상적인 사용 방법이라고 생각함.
// 어차피 총 테스트 케이스 수인 n(c)는 어차피 재활용을 하는 경우가 거의 없기 때문에 이렇게 소모해서 시간이나 메모리를 줄이는 것도 하나의 방법이라고 생각함.

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;

    	int c = Integer.parseInt(br.readLine());
    	
    	while (c --> 0) {
    		
    		Set<String> allTeam = new HashSet<>();
    		Set<String> loseTeam = new HashSet<>();
    		for (int i = 0; i < 16; i++) {

    			st = new StringTokenizer(br.readLine());
    			String t1 = st.nextToken();
    			String t2 = st.nextToken();
    			int g1 = Integer.parseInt(st.nextToken());
    			int g2 = Integer.parseInt(st.nextToken());

    			allTeam.add(t1);
    			allTeam.add(t2);
    			
    			if (g1 > g2) loseTeam.add(t2);
    			else loseTeam.add(t1);
    			
    		}
    		
    		allTeam.removeAll(loseTeam);

    		Iterator<String> iter = allTeam.iterator();

    		sb.append(iter.next()).append("\n");
    	}
    	
    	System.out.print(sb);
    	
    }   
}
 */