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
	public static int gcd(int x, int y){
		if (y == 0) return x; else return gcd(y, x % y);
	}
	 static class R implements Comparable<R>{
	        int x, y;
	        public  R(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }
	        public int compareTo(R o) {
            		return x-o.x;     //Increasing order(Which is usually required)
        		}
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
		int n = nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=nextInt();
		}
		int b=0;
		for(int i=0;i<n-2;i++){
		    for(int j=i+1;j<n-1;j++){
		        int A = Math.min(a[i], a[i + 1]), B = Math.max(a[i], a[i + 1]);
		    	int C = Math.min(a[j], a[j + 1]), D = Math.max(a[j], a[j + 1]);
		    	if (A < C && C < B && B < D) b = 1;
		    	if (C < A && A < D && D < B) b = 1;
		    }
		}
		if(b==1){
		    writer.println("yes");
		}
		else{
		    writer.println("no");
		}
		
	}
}