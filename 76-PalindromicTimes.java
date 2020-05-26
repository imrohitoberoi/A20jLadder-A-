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
		String time = nextToken();
		String result="00:00";
int h = (time.charAt(0)-'0')*10+time.charAt(1)-'0';
		int mm = (time.charAt(3)-'0')*10+time.charAt(4)-'0'+1;
		
		boolean first = true;
		
		outer:
		for (; h < 24; h++) {
			for (int m = (first ? mm : 0); m < 60; m++) {
				
				String temp = "";
				if (h < 10) {
					temp += "0";
				}
				temp += "" + h + ":";
				if (m < 10) {
					temp += "0";
				}
				temp += "" + m;
				if (temp.equals(new StringBuffer(temp).reverse().toString())) {
					result = temp;
					break outer;
				}
			}
			first = false;
		}
		
		writer.println(result);
	}
}