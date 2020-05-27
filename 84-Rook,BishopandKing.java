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
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		int d = nextInt();
		int ans1=0,ans2=0,ans3=0;
    	if(a==c&&b==d)
    	{
    	    writer.println("0 0 0");
    		return;
    	}
    	if(a==c||b==d){
    	    ans1=1;
    	}
    	else{
    	    ans1=2;
    	} 
    	if((a+b)%2==(c+d)%2)
    	{
    		if(a+b==c+d||a-b==c-d){
    		    ans2=1;
    		}
    		else{
    		    ans2=2;
    		} 
    	}
        ans3=Math.max(Math.abs(a-c),Math.abs(b-d));
	    writer.println(ans1+" "+ans2+" "+ans3);
	}
}