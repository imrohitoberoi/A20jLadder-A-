import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws FileNotFoundException,IOException{
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		File outFile = new File("output.txt");
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));

		int n = sc.nextInt();

		boolean a[] = new boolean[4];
		a[n] = true;
		for(int i=0;i<3;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean t = a[x];
			a[x] = a[y];
			a[y] = t;
		}

		int ans = 1;
		while(a[ans]!=true){
		    ans++;
		}
		pw.println(ans);
		pw.close();
	}
}
