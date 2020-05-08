import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.StringTokenizer;  
import java.util.*;
import java.io.*;
 
public class Main 
  {
   static class Reader 
   { 
       final private int BUFFER_SIZE = 1 << 16; 
       private DataInputStream din; 
       private byte[] buffer; 
       private int bufferPointer, bytesRead; 
 
       public Reader() 
       { 
           din = new DataInputStream(System.in); 
           buffer = new byte[BUFFER_SIZE]; 
           bufferPointer = bytesRead = 0; 
       } 
 
       public Reader(String file_name) throws IOException 
       { 
           din = new DataInputStream(new FileInputStream(file_name)); 
           buffer = new byte[BUFFER_SIZE]; 
           bufferPointer = bytesRead = 0; 
       } 
 
       public String nextLine() throws IOException 
       { 
           byte[] buf = new byte[100000000]; // line length 
           int cnt = 0, c; 
           while ((c = read()) != -1) 
           { 
               if (c == '\n') 
                   break; 
               buf[cnt++] = (byte) c; 
           } 
           return new String(buf, 0, cnt); 
       } 
 
       public int nextInt() throws IOException 
       { 
           int ret = 0; 
           byte c = read(); 
           while (c <= ' ') 
               c = read(); 
           boolean neg = (c == '-'); 
           if (neg) 
               c = read(); 
           do
           { 
               ret = ret * 10 + c - '0'; 
           }  while ((c = read()) >= '0' && c <= '9'); 
 
           if (neg) 
               return -ret; 
           return ret; 
       } 
 
       public long nextLong() throws IOException 
       { 
           long ret = 0; 
           byte c = read(); 
           while (c <= ' ') 
               c = read(); 
           boolean neg = (c == '-'); 
           if (neg) 
               c = read(); 
           do { 
               ret = ret * 10 + c - '0'; 
           } 
           while ((c = read()) >= '0' && c <= '9'); 
           if (neg) 
               return -ret; 
           return ret; 
       } 
 
       public double nextDouble() throws IOException 
       { 
           double ret = 0, div = 1; 
           byte c = read(); 
           while (c <= ' ') 
               c = read(); 
           boolean neg = (c == '-'); 
           if (neg) 
               c = read(); 
 
           do { 
               ret = ret * 10 + c - '0'; 
           } 
           while ((c = read()) >= '0' && c <= '9'); 
 
           if (c == '.') 
           { 
               while ((c = read()) >= '0' && c <= '9') 
               { 
                   ret += (c - '0') / (div *= 10); 
               } 
           } 
 
           if (neg) 
               return -ret; 
           return ret; 
       } 
 
       private void fillBuffer() throws IOException 
       { 
           bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
           if (bytesRead == -1) 
               buffer[0] = -1; 
       } 
 
       private byte read() throws IOException 
       { 
           if (bufferPointer == bytesRead) 
               fillBuffer(); 
           return buffer[bufferPointer++]; 
       } 
 
       public void close() throws IOException 
       { 
           if (din == null) 
               return; 
           din.close(); 
       } 
   } 
public static  int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
   public static void main(String[] args) throws IOException 
   { 
       Reader sc=new Reader();
       /*String qqqq=sc.nextLine();
       char c=qqqq.charAt(0);*/
       //String s=sc.nextLine();
       /*String s="";
       String[] qqq=sc.nextLine().split(" ");
       s=qqq[0];*/
       int x1=sc.nextInt();
       int y1=sc.nextInt();
       int x2=sc.nextInt();
       int y2=sc.nextInt();
       if(x1!=x2&&y1!=y2&&Math.abs(x1-x2)!=Math.abs(y1-y2)){
           System.out.println("-1");
       }
       else if(x1==x2){
           System.out.println((x1+Math.abs(y1-y2))+" "+y1+" "+(x1+Math.abs(y1-y2))+" "+y2);
       }
       else if(y1==y2){
           System.out.println(x1+" "+(y1+Math.abs(x1-x2))+" "+x2+" "+(y2+Math.abs(x1-x2)));
       }
       else{
           System.out.println(x1+" "+y2+" "+x2+" "+y1);
       }
  }
  
  }      
