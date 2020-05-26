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
	    int a[] = new int[n+1];
        for (int i = 0; i < n; i++)
           a[i] = nextInt();
        a[n] = a[0];
        int x = 0;
        int y = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++)
            if(Math.abs(a[i]-a[i-1]) < min){
                min = Math.abs(a[i]-a[i-1]);
                x = i;
                y = i-1;
            }
        x++;
        y++;
        if(x == n+1){
            x = 1;
            y = n;
        }
        writer.println(y+" "+x);
	}
}
 