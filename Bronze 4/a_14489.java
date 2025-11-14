import java.io.*;
import java.util.StringTokenizer;
public class a_14489 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        int ab = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine()) * 2;
        int cal = ab - c;
        if (cal >= 0) System.out.println(cal);
        else System.out.println(ab);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_14489().run();
    }
}

/* 11528kb, 80ms
import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer tk;
	static int ans;
	
	public static void main(String[] args) throws Exception {
		tk = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(br.readLine())*2;
		br.close();
		ans = Integer.parseInt(tk.nextToken());
		ans += Integer.parseInt(tk.nextToken());
		
		System.out.println(ans >= c ? ans-c : ans);
	}
}
 */