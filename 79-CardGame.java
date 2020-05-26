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
	//String str=nextToken();
	//String[] s = str.split("\\s+");
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
	    String cards="6789TJQKA";
		String god = nextToken();
        String first = nextToken(), second = nextToken();
        boolean can = false;
        if (first.charAt(1) != second.charAt(1)) {
            if (first.charAt(1) == god.charAt(0)) {
                can = true;
            } else {
                can = false;
            }
        } else {
            if (cards.indexOf(first.charAt(0)) > cards.indexOf(second.charAt(0))) {
                can = true;
            }
        }
        writer.println(can ? "YES" : "NO");
	}
}