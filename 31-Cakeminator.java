import java.io.*;
import java.util.*;

public class Test {
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	static PrintWriter writer;

	static int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	static String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = null;
		writer = new PrintWriter(System.out);
		solve();
		reader.close();
		writer.close();
	}

	private static void solve() throws IOException {
		int r = nextInt();
		int c = nextInt();
	//	int[] a=new int[n];
	//	for(int i=0;i<n;i++){
	//		a[i]=nextInt();
	//	}
	int[] a=new int[r];
       int[] b=new int[c];
       String[] s=new String[r];
       for(int i=0;i<r;i++){
           s[i]=nextToken();
       }
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(s[i].charAt(j)=='S'){
                   a[i]=1;
                   b[j]=1;
               }
           }
       }
       int ans=0;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(a[i]==0||b[j]==0){
                    ans++;
               }
           }
       }
		writer.println(ans);
	}
}