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
		int m = nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		int max1=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			a[i]=nextInt();
			max1=Math.max(max1,a[i]);
			min1=Math.min(min1,a[i]);
		}
		for(int i=0;i<m;i++){
			b[i]=nextInt();
			min2=Math.min(min2,b[i]);
		}
		int ans=2*min1;
		ans=ans<max1?max1:ans;
		if(ans>=min2){
		    writer.println("-1");
		}
		else{
		    writer.println(ans);
		}
		
	}
}