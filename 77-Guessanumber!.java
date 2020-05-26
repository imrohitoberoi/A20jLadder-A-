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
		int mx=2000000000;
		int mn=-2000000000;
		while(n-->0){
		  //  String str=nextToken();
		   // String[] s = str.split("\\s+");
		    String s1=nextToken();
		    int m=Integer.parseInt(nextToken());
		    String s2=nextToken();
		    //writer.println(m+" "+s1+" "+s2);
		    if(s2.equals("N")){
		        if(s1.equals(">=")){
		            s1="<";
		        }
		        else if(s1.equals(">")){
		            s1="<=";
		        }
		        else if(s1.equals("<=")){
		            s1=">";
		        }
		        else{
		            s1=">=";
		        }
		    }
		    if(s1.equals(">=")){
		        mn=Math.max(mn,m);
		    }
		    else if(s1.equals(">")){
		        mn=Math.max(mn,m+1);
		    }
		    else if(s1.equals("<")){
		        mx=Math.min(mx,m-1);
		    } 
		    else if(s1.equals("<=")){
		        mx=Math.min(mx,m);
		    } 
		}
		if (mn <= mx){
		    writer.println(mx);
		} 
	    else{
	        writer.println("Impossible");
	    }
	}
}