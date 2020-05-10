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

       String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] =nextToken();
        }
        int []d = {0,-1,0,1,-1,0,1,0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int t = 0;
                for (int k = 0; k < d.length; k+= 2) {
                    if (d[k] + i > -1 && d[k + 1] + j < n && d[k + 1] + j > -1 && d[k] + i < n && s[d[k] + i].charAt(j + d[k + 1]) == 'o' )t++;
                }
                if (t % 2 != 0){
                    writer.println("NO");return;
                }
            }
        }
		writer.println("YES");
	}
}