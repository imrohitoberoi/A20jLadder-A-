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
		int r1 = nextInt();
		int r2 = nextInt();
		int c1 = nextInt();
		int c2 = nextInt();
		int d1 = nextInt();
		int d2 = nextInt();
		int x1=(c1+d1-r2)/2;
		int x2=r1-x1;
		int y1=c1-x1;
		int y2=c2-x2;
		if(x1>=10||x1<=0||y1>=10||y1<=0||x2>=10||x2<=0||y2>=10||y2<=0||x1==x2||y1==x1||x1==y2||x2==y1||x2==y2||y1==y2){
		    writer.println("-1");
		    return;
		}
		if(x1+x2==r1&&y1+y2==r2&&x1+y1==c1&&x2+y2==c2&&x1+y2==d1&&x2+y1==d2){
		    writer.println(x1+" "+x2);
		    writer.println(y1+" "+y2);
		    return;
		}
		writer.println("-1");
	}
}