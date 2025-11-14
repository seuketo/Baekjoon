import java.io.*;
public class a_21964 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    public void run() throws Exception{
        int n = Integer.parseInt(br.readLine());
        String[] arr = (br.readLine()).split("");
        for (int i = n - 5; i < n; i++) sb.append(arr[i]);
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_21964().run();
    }
}

/* substring으로 특정 범위 안의 문자열만 출력. 15476kb, 136ms

import java.io.*;

public class Main {
	
	static int N;
	static String word, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		word = br.readLine();
		br.close();
		
		ans = word.substring(N-5, N);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
 */