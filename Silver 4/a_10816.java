import java.io.*;
import java.util.*;

public class a_10816 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    public void run() throws IOException{
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> arr = new TreeMap<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            int key = Integer.parseInt(st.nextToken());
            int value = 0;
            if (!arr.containsKey(key)) arr.put(key, 1);
            else {
                value = arr.get(key);
                arr.replace(key, value + 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            if (arr.get(num) == null) sb.append(0);
            else sb.append(arr.get(num));
            sb.append(" ");
        }
        sb.trimToSize();
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) {
        try{
            new a_10816().run();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}


/*
 - 카운팅 정렬? 근데 음수까지 뻗어있어서 카운팅이 가능할지가 의문
 - 배열 2개 사용해서 음수일 경우와 양수일 경우를 나눠서 저장하는 방법도 가능함.
 - 여차하면 Map도 사용 가능하긴 함.

 */

/* 통과 이후 참고해볼만한 통과된 코드 하나 발견해서 기록
 * 시간은 동일하게 받았는데 메모리를 6000kb 정도 덜 먹는 코드여서 어떤 방식을 썼는지 보면 좋을듯.
 * 제출 번호 100283340 - asgvcx

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int B[] = new int[M];
		for(int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(st.nextToken());
			
			int first = firstBinary(A, B[i], 0, N-1);
			int last  = lastBinary(A, B[i], 0, N-1);
				 	
			if (first == -1)
				sb.append(0).append(" ");
			else
				sb.append(last - first + 1).append(" ");
			
		}
		 System.out.println(sb.toString());
	}
	
	//처음 위치 찾기
	static int firstBinary(int[] arr, int key, int start, int end){
		if(start> end) return -1;
		
		int mid = (start + end) / 2;
					
		if (arr[mid] == key) {
			int leftIdx = firstBinary(arr, key, start, mid-1);
			if (leftIdx != -1)
				return leftIdx;
		}
		
		if(arr[mid] < key)
			return firstBinary(arr, key, mid+1, end);
		if(arr[mid] > key)
			return firstBinary(arr, key, start, mid-1);
		else
			return mid;
	}
	//마지막 위치 찾기
	static int lastBinary(int[] arr, int key, int start, int end){
		if(start> end) return -1;
		
		int mid = (start + end) / 2;
		
		if (arr[mid] == key) {
			int lastIdx = lastBinary(arr, key, mid+1, end);
			if (lastIdx != -1)
				return lastIdx;
		}
		
		if(arr[mid] < key)
			return lastBinary(arr, key, mid+1, end);
		if(arr[mid] > key)
			return lastBinary(arr, key, start, mid-1);
		else
			return mid;
	}
	

}

 */