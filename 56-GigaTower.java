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
	public static boolean hasEight(long n){
        String str = Long.toString(n);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '8') return true;
        }
        
        return false;
    }
	private static void solve() throws IOException {
		long n = nextLong();
		for(long i = 1; i < 20; i++){
            n += 1;
            if(hasEight(n)) {
                writer.println(i);
                return ;
            }
        }
		
		
	}
}