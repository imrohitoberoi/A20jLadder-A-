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
	public static int right( int x1, int y1, int x2, int y2, int x3, int y3 ) {
       int a = (x2-x3)*(x2-x3) + (y2-y3)*(y2-y3);
       int b = (x1-x3)*(x1-x3) + (y1-y3)*(y1-y3);
       int c = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
       if( a == 0 || b == 0 || c == 0 ){
           return 0;
       } 
       if( a + b == c ){
           return 1;
       } 
       if( a + c == b ){
           return 1;
       }
       if( b + c == a ){
           return 1;
       }
       return 0;
}
	private static void solve() throws IOException {
	    
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };
		int x1 = nextInt();
		int y1 = nextInt();
		int x2 = nextInt();
		int y2 = nextInt();
		int x3 = nextInt();
		int y3 = nextInt();
		int c=right(x1, y1, x2, y2, x3, y3);
		if(c==1){
		    writer.println("RIGHT");
		    return;
		}
		int almost = 0;
        for( int d = 0; d < 4; ++d ) {
            almost |= right( x1+dx[d], y1+dy[d], x2, y2, x3, y3 );
            almost |= right( x1, y1, x2+dx[d], y2+dy[d], x3, y3 );
            almost |= right( x1, y1, x2, y2, x3+dx[d], y3+dy[d] );
        }
        if( almost==1 ){
            writer.println("ALMOST");
        }
        else{
            writer.println("NEITHER");
        }
	}
}