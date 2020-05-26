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
		String s = nextToken();
		long L=0;
		long R=0;
		int id=0;   
		for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '^'){
                id = i;
                break;
            }
                
        for (int i = 0; i < id; i++)
            if (s.charAt(i) != '=')
                L += (s.charAt(i) - 48) * (id - i);
     
        for (int i = id + 1; i < s.length(); i++)
            if (s.charAt(i) != '=')
                R += (s.charAt(i) - 48) * (i - id);
     
        if (L > R)
            	writer.println("left");
        else if (R > L)
            	writer.println("right");
        else
            	writer.println("balance");
	}
}