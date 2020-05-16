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
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		int[] ar=new int[n+1];
		Arrays.fill(ar, -1);
		ar[0]=0;
		int r=call(ar,n,a,b,c);
		writer.println(r);
	}
	public static int call(int[] ar, int n, int a, int b, int c){
	    if(n<0){
	        return -110000;
	    }
	    if(ar[n]!=-1){
	        return ar[n];
	    }
	    int res=1+call(ar,n-a,a,b,c);
	    res=Math.max(res,1+call(ar,n-b,a,b,c));
	    res=Math.max(res,1+call(ar,n-c,a,b,c));
	    ar[n]=res;
	    return res;
	}
}