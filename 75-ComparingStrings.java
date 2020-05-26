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
		String  s1 = nextToken();
		String  s2 = nextToken();
		if (s1.length() != s2.length()) {
		    writer.println("NO");
            return;
        }
        int n = s1.length();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                a.add(i);
            }
        }
        if (a.size() != 2) {
            writer.println("NO");
            return;
        }
        if (s1.charAt(a.get(0)) == s2.charAt(a.get(1)) && s2.charAt(a.get(0)) == s1.charAt(a.get(1))) {
            writer.println("YES");
            return;
        }
        writer.println("NO");
        return;
	}
}