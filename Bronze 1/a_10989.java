import java.io.*;

public class a_10989{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    final int MAX = 10_000;
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[MAX + 1];
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[input]++;
        }
        for (int i = 1; i <= MAX; i++) {
            if (arr[i] != 0) {
                while (arr[i] --> 0) sb.append(i).append("\n");
            }
        }
        sb.substring(sb.length());
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws IOException{
        try{
            new a_10989().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

/*
 * 카운팅 정렬
    - 퀵 정렬을 사용해도 커버가 안 될 정도의 시간 제한과 메모리 제한이 걸린 문제에서 사용해볼만한 정렬 방법
    - 수의 범위만큼 배열을 만들어놓고, 입력값을 하나씩 받으면서 해당 입력값 인덱스에 존재하는 value를 +1 시켜 갯수를 세는 방식
    - 해당 문제는 오름차순으로 정렬 후 출력하는 문제였기 때문에 0부터 차례대로 출력하도록 코드를 작성.
    - value가 0이 아닌 경우 해당 value 만큼 index값을 출력하는 방식.
 */