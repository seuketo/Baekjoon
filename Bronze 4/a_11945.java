import java.io.*;
import java.util.StringTokenizer;
public class a_11945 {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();
    private StringBuffer sf;
    public void run() throws Exception{
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0; i < a; i++){
            sf = new StringBuffer(br.readLine());
            sb.append(sf.reverse().toString() + "\n");
        }
        System.out.print(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new a_11945().run();
    }
}


/*
import java.io.*;
 
public class Main {
	
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		for(int i=0 ; i<N ; i++) {
			String ans = "";
			String line = br.readLine();
			for(int j=0 ; j<M ; j++) {
				ans += line.substring(M-j-1, M-j);
			}
			sb.append(ans+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
 */