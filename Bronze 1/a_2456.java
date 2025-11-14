import java.io.*;
import java.util.*;
class status{
    int[] score;
    int[] three_count;
    int[] two_count;
    StringTokenizer st;

    status(){
        this.score = new int[3];
        this.three_count = new int[3];
        this.two_count = new int[3];
    }

    public void status_add(String sen){
        st = new StringTokenizer(sen);
        for (int i = 0; i < 3; i++){
            int num = Integer.parseInt(st.nextToken());
            this.score[i] += num;
            if (num == 2) this.two_count[i]++;
            else if (num == 3) this.three_count[i]++;
        }
    }

    public int compare_three(int max_score) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) if (this.score[i] == max_score) a.add(i);
        switch (a.size()){
            case 1:
                return single_find(max_score);
            case 2:
                if (three_count[a.get(0)] > three_count[a.get(1)]) return a.get(0) + 1;
                else if (three_count[a.get(0)] == three_count[a.get(1)]) return compare_two(a.get(0), a.get(1));
                else return a.get(1) + 1;

            case 3:
                int two01 = compare_two(a.get(0), a.get(1));
                int two02 = compare_two(a.get(0), a.get(2));
                int two12 = compare_two(a.get(1), a.get(2));

                int max = Math.max(two01, Math.max(two02, two12));
                int max_count = 0;
                int max_index = 0;
                if (two01 == max) {
                    max_count++;
                    max_index = two01;
                }
                if (two02 == max) {
                    max_count++;
                    max_index = two02;
                }
                if (two12 == max) {
                    max_count++;
                    max_index = two12;
                }
                if (max_count > 1) return 0;
                else return max_index;

            default:
                return 0;
        }
    }

    public int compare_two(int a, int b){
        if (two_count[a] > two_count[b]){
            return a;
        } else if (two_count[a] < two_count[b]){
            return b;
        } else return 0;
    }

    public int single_find(int num) {
        if (this.score[0] == num) return 1;
        else if (this.score[1] == num) return 2;
        else if (this.score[2] == num) return 3;
        return 0;
    }
}
public class a_2456 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException {
        int n = Integer.parseInt(br.readLine());
        status s = new status();
        for (int i = 0; i < n; i++) {
            s.status_add(br.readLine());
        }
        int max_count = 0;
        int max_index = 0;
        int max_score = Math.max(s.score[0], Math.max(s.score[1], s.score[2]));
        for (int i = 0; i < 3; i++) {
            if (s.score[i] == max_score) max_count++;
        }
        if (max_count >= 2) max_index = s.compare_three(max_score);
        else max_index = s.single_find(max_score);
        System.out.println(max_index + " " + max_score);
        br.close();

    }
    public static void main(String[] args) throws IOException {
        try{
            new a_2456().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 - 선호도가 주어지는데, 회장 선발의 우선순위는 다음과 같음.
    1. 점수가 가장 높은 자
    2. 3점이 가장 많은 자
    3. 2점이 가장 많은 자

 - 우위를 가릴 수 없는 경우 0을 출력 후 최대 점수 출력.
 */
