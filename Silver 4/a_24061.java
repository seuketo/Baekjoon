import java.util.*;
import java.io.*;
// mergeSort, merge에서 사용할 객체 변수 선언 (참조용)
class mergeInput{
    int count;
    int cycle;
    int[] arr;
    int[] result;

    mergeInput(int count, int length){
        this.count = count;
        cycle = 1;
        arr = new int[length];
        result = new int[length];
    }
}

public class a_24061{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            mergeInput mi = new mergeInput(0, n);
            for (int i = 0; i < n; i++) mi.arr[i] = Integer.parseInt(st.nextToken());
            mergeSort(0, n - 1, mi, k);
    }

    public void mergeSort(int p, int r, mergeInput mi, int k) {
        if (p < r) { // 조건문이자 종료문.
            int q = (p + r) / 2; // 중간 지점 계산
            mergeSort(p, q, mi, k);   // 전반부 정렬
            mergeSort(q + 1, r, mi, k); // 후반부 정렬
            merge(p, q, r, mi, k);   // 병합
            //System.out.println(mi.count + ": " + Arrays.toString(mi.arr) + " - mergeSort");
        }
    }

    public void merge(int p, int q, int r, mergeInput mi, int k) {
        if (mi.count == k) mi.result = mi.arr;
        else{
            int i = p, j = q + 1, t = 0;
            int[] tmp = new int[r - p + 1]; // 임시 배열 생성
            // 두 부분을 병합
            while (i <= q && j <= r) {
                if (mi.arr[i] <= mi.arr[j]) {
                    tmp[t++] = mi.arr[i++];
                } else {
                    tmp[t++] = mi.arr[j++];
                }
                System.out.println(mi.count + ": " + Arrays.toString(mi.arr) + " - 1");
            }

            // 왼쪽 부분이 남은 경우
            while (i <= q) {
                tmp[t++] = mi.arr[i++];
                System.out.println(mi.count + ": " + Arrays.toString(mi.arr) + " - 2");
            }

            // 오른쪽 부분이 남은 경우
            while (j <= r) {
                tmp[t++] = mi.arr[j++];
                System.out.println(mi.count + ": " + Arrays.toString(mi.arr) + " - 3");
            }

            // 정렬된 결과를 원래 배열에 복사
            System.arraycopy(tmp, 0, mi.arr, p, tmp.length);
            System.out.println(mi.count + ": " + Arrays.toString(mi.arr) + " - 4");

            if (k > mi.count) mi.count++;
            else if (k == mi.count){
                System.out.println(mi.count);
                for (int a = 0; a < mi.arr.length; a++) {
                    if (a == mi.arr.length - 1) System.out.print(mi.result[a]);
                    else System.out.print(mi.arr[a] + " ");
                }
            } else System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        try{
            new a_24061().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}


/*
 * A = N개의 서로 다른 정수가 저장된 배열
-------------------------------------------------------------------------------------
     * mergeSort() 작동 방식
        - if 조건문이 mergeSort()의 재귀를 종료하는 구문.
        - 전반부, 후반부를 나누는 걸로 확인할 수 있음. 실제 작동 순서는 다음과 같음.
        if) p = 0, r = 6
            1. mergeSort(arr, 0, 3)
                1-1. mergeSort(arr, 0, 1)
                    1-1-1. mergeSort(arr, 0, 0)
                    1-1-2. mergeSort(arr, 1, 1)
                    1-1-3. merge(arr, 0, 0, 1)                                          
                1-2. mergeSort(arr, 2, 3)
                    1-2-1. mergeSort(arr, 2, 2)
                    1-2-2. mergeSort(arr, 3, 3)
                    1-2-3. merge(arr, 2, 2, 3)
                1-3. merge(arr, 0, 1, 3)
            2. mergeSort(arr, 4, 6)
                2-1. mergeSort(arr, 4, 5)
                    2-1-1. mergeSort(arr, 4, 4)
                    2-1-2. mergeSort(arr, 5, 5)
                    2-1-3. merge(arr, 4, 4, 5)
                2-2. mergeSort(arr, 5, 6)
                    2-2-1. mergeSort(arr, 5, 5)
                    2-2-2. mergeSort(arr, 6, 6)
                    2-2-3. merge(arr, 5, 5, 6)
                2-3. merge(arr, 4, 5, 6)
            3. merge(arr, 0, 3, 6)

    // merge() : mergeSort()로 정렬한 전후반부 배열을 병합, 실질적으로 정렬도 겸하는 함수임. 
    // mergeSort()는 배열 쪼개기 역할로 봐도 무방.
  */

/*
import java.util.*;
import java.io.*;
// mergeSort, merge에서 사용할 객체 변수 선언 (참조용)
class mergeInput{
    int count;
    int cycle;
    int[] arr;

    mergeInput(int count, int length){
        this.count = count;
        cycle = 1;
        arr = new int[length];
    }
}

public class a_24061 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws IOException{
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            mergeInput mi = new mergeInput(0, n);
            for (int i = 0; i < n; i++) mi.arr[i] = Integer.parseInt(st.nextToken());
            System.out.println(Arrays.toString(mi.arr));
            mergeSort(0, mi.arr.length - 1, mi, k);
            for (int i = 0; i < n; i++) System.out.print(mi.arr[i] + " ");
    }

    public void mergeSort(int p, int r, mergeInput mi, int k) {
        System.out.println("mergeSort count : " + mi.count);
        if (mi.count != k && p < r) { // 조건문이자 종료문.
            System.out.println("-------- mergeSort IN --------");
            int q = (p + r) / 2; // 중간 지점 계산
            mergeSort(p, q, mi, k);   // 전반부 정렬
            mergeSort(q + 1, r, mi, k); // 후반부 정렬
            merge(p, q, r, mi, k);   // 병합
        }
    }

    public void merge(int p, int q, int r, mergeInput mi, int k) {
        System.out.println("cycle " + mi.cycle + " : " + Arrays.toString(mi.arr));
        if (mi.count != k){
            int i = p, j = q + 1, t = 0;
            int[] tmp = new int[r - p + 1]; // 임시 배열 생성
            // 두 부분을 병합
            while (i <= q && j <= r) {
                if (mi.arr[i] <= mi.arr[j]) {
                    tmp[t++] = mi.arr[i++];
                } else {
                    tmp[t++] = mi.arr[j++];
                }
                mi.count++;
            }

            // 왼쪽 부분이 남은 경우
            while (i <= q) {
                tmp[t++] = mi.arr[i++];
                mi.count++;
            }

            // 오른쪽 부분이 남은 경우
            while (j <= r) {
                tmp[t++] = mi.arr[j++];
                mi.count++;
            }

            // 정렬된 결과를 원래 배열에 복사
            mi.count++;
            System.arraycopy(tmp, 0, mi.arr, p, tmp.length);
        }
    }

    public static void main(String[] args) {
        try{
            new a_24061().run();
        } catch (IOException e){
            System.err.println("오류 발생 : " + e.getMessage());
        }
    }
}
 */
