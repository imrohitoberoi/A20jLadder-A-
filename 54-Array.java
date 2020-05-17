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

	static /*int*/long gcd(/*int*/long x, /*int*/long y){
  	      if(x==0)
    	        return y;
      	      if(y==0)
        	        return x;
     	      /*int*/long r=0, a, b;
      	      a = (x > y) ? x : y; // a is greater number
      	      b = (x < y) ? x : y; // b is smaller number
      	      r = b;
     	     while(a % b != 0){
     	        r = a % b;
     	        a = b;
      	        b = r;
     	   }
                   return r;
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
		List<Integer> first  = new ArrayList<Integer>();
		List<Integer> second  = new ArrayList<Integer>();
		List<Integer> third = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			if (a < 0) {
				first.add(a);
			} else if (a == 0) {
				third.add(a);
			} else {
				second.add(a);
			}
		}
		if (first.size() % 2 == 0) {
			third.add(first.get(first.size() - 1));
			first.remove(first.size() - 1);
		}
		if (second.size() == 0) {
			second.add(first.get(0));
			second.add(first.get(1));
			first.remove(1);
			first.remove(0);
		}
		writer.print(first.size());
		for (int t : first) {
			writer.print(" " + t);
		}
		writer.println();
		writer.print(second.size());
		for (int t : second) {
			writer.print(" " + t);
		}
		writer.println();
		writer.print(third.size());
		for (int t : third) {
			writer.print(" " + t);
		}
	}
}

		