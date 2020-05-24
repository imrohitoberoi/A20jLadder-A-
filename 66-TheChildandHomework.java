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
	
	int[] cnt = new int[4];
        for (int i = 0; i < 4; i++) {
            String s = nextToken();
            cnt[i] = s.length() - 2;
        }
        ArrayList<Integer> great = new ArrayList<Integer>();
            for (int i = 0; i < 4; i++) {
                 boolean small = true;
                 boolean large = true;
                 for (int j = 0; j < 4; j++) {
                    if (i!=j&&2*cnt[i] > cnt[j]) small = false;
                    if (i!=j&&cnt[i] < 2*cnt[j]) large = false;
                     }
            if (small || large) {
                great.add(i);
            }
        }
        if (great.size() == 1) {
            writer.println((char) (great.get(0) + 'A'));
        } else {
            writer.println("C");
        }
	}
}

