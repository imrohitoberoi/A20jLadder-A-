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
	static String nexts() throws IOException {
	  	  tokenizer = new StringTokenizer(reader.readLine());
	   	 String s="";
	   	 while (tokenizer.hasMoreTokens()) {
			s+=tokenizer.nextElement()+" ";
		}
		return s;
	}

	//String str=nextToken();
	//String[] s = str.split("\\s+");

	public static int gcd(int x, int y){
		if (y == 0) return x; else return gcd(y, x % y);
	}

	public static boolean isPrime(int n) 
	    { 
	        // Corner cases 
	        if (n <= 1){
		 return false; }
	        if (n <= 3){
		 return true; }
	      
	        // This is checked so that we can skip  
	        // middle five numbers in below loop 
	        if (n % 2 == 0 || n % 3 == 0){
		 return false; }
	      
	        for (int i = 5; i * i <= n; i = i + 6) {    //Checking 6i+1 & 6i-1
	            if (n % i == 0 || n % (i + 2) == 0) {
	            	return false;  }
	            }
			//O(sqrt(n))
	        return true; 
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
		int[] a=new int[101];
		int m = nextInt();
		int b = nextInt();
		for(int i=1;i<n;i++){
			int p = nextInt();
			int q = nextInt();
			for(int j=p;j<q;j++){
			    a[j]=1;
			}
		}
		int ans=0;
		for(int i=m;i<b;i++){
		    if(a[i]==0){
		        ans++;
		    }
		}
		writer.println(ans);
	}
}