import java.io.*;
import java.util.*;

public class a {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("input.txt"));
        PrintStream ps = new PrintStream(new File("output.txt"));
        int n=scan.nextInt();
        String s=scan.next();
        for(int i=1;i<=n/2;i++)
            if(s.charAt(i-1)=='R'&&s.charAt(i+n/2-1)=='L')
                ps.println(i+n/2+" "+i);
            else
                ps.println(i+" "+(i+n/2));
    }
}