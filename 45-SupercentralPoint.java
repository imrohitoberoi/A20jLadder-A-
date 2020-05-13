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
        int ans=0;
        int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++){
			x[i]=nextInt();
			y[i]=nextInt();
		}
        for(int i=0;i<n;i++)
        {
            int a=0, b=0, c=0, d=0;
            for(int j=0;j<n;j++)
            {
                if (i==j) continue;
                if (x[j]==x[i] && y[j]<y[i]){
                    a=1;
                } 
                if (x[j]==x[i] && y[j]>y[i]){
                    b=1;
                } 
                if (x[j]<x[i] && y[j]==y[i]){
                    c=1;
                } 
                if (x[j]>x[i] && y[j]==y[i]){
                    d=1;
                } 
            }
            if (a+b+c+d==4){
                ans++;
            } 
        }
        writer.println(ans);
	}
}