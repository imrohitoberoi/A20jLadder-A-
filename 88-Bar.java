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
		int n = nextInt();
		ArrayList<String> a=new ArrayList<String>();
		a.add("ABSINTH");
		a.add("BEER"); 
		a.add("BRANDY"); 
		a.add("CHAMPAGNE"); 
		a.add("GIN"); 
		a.add("RUM"); 
		a.add("SAKE"); 
		a.add("TEQUILA"); 
		a.add("VODKA");  
		a.add("WHISKEY"); 
		a.add("WINE"); 
		int c=0;
		for(int i=0;i<n;i++){
			String s=nextToken();
			if(s.charAt(0)>='0'&&s.charAt(0)<='9'){
			    int m=Integer.parseInt(s);
			    if(m<18){
			        c++;
			    }
			}
			else{
			    if(a.contains(s)){
			        c++;
			    }
			}
		}
		writer.println(c);
	}
}