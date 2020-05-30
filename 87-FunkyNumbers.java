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
	   public static boolean prime(int n) 
    { 
        // Corner case 
        if (n <= 1) return false; 
      
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
      
        return true; 
    } 

	private static void solve() throws IOException {
		int N = nextInt();
	HashSet<Integer> a = new HashSet<Integer>();
      for (int i=1; i<1000000; i++)
      {
         long val = i*(i+1L);
         val = val/2;
         if (val >= N)
            break;
         a.add((int)val);
      }
 
      boolean passed = false;
      for (int v : a)
      {
         int nn = N-v;
         if (a.contains(nn))
         {
            passed = true;
            break;
         }
      }
    writer.println(passed?"YES":"NO");
	}
}