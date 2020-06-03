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
		int n = nextInt();
		String s = nextToken();
		int r=0,l=0;
	for(int i=0;i<n;i++)
	{
		if(s.charAt(i)=='R')
			r=1;
		if(s.charAt(i)=='L')
			l=1;
	}
	if(r==0)
	{
		for(int i=0;i<n;i++)
			if(s.charAt(i)=='L')
			{
				writer.println(i+1+" "+i);
				return;
			}
	}
	if(l==0)
	{
		for(int i=n-1;i>0;i--)
			if(s.charAt(i)=='R')
			{
			    int c=i+2;
				writer.println(i+1+" "+c);
				return;
			}
	}
	for(int i=0;i<n;i++)
		if(s.charAt(i)=='R')
		{
			writer.println(i+1+" ");
			break;
		}
	for(int i=0;i<n;i++)
		if(s.charAt(i)=='L')
		{
			writer.println(i);
			break;
		}
		
	}
}
