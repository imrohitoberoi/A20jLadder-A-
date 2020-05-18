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
	public static int reduce(int a) {
  int ret = 0;
  int ten = 1;
  while(a>0) {
    int d = a % 10;
    a /= 10;
    if(d>0){
        ret += d * ten;
    ten *= 10;
    } 
  }
  return ret;
}
 
	private static void solve() throws IOException {
		int a = nextInt();
		int b = nextInt();
		int c=a+b;
		a=reduce(a);
		b=reduce(b);
		c=reduce(c);
		if(a+b==c){
		    writer.println("YES");
		}
		else{
		    writer.println("NO");
		}
		
	}
}