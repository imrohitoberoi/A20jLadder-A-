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
       int n=sc.nextInt();
       int p=sc.nextInt();
       ArrayList<Integer> ar = new ArrayList<Integer>();
       int[] a1=new int[p];
       for(int i=0;i<p;i++){
           a1[i]=sc.nextInt();
           ar.add(a1[i]);
       }
       int q=sc.nextInt();
       int[] a2=new int[q];
       for(int i=0;i<q;i++){
           a2[i]=sc.nextInt();
           ar.add(a2[i]);
       }
       boolean t=true;
       for(int i=1;i<=n;i++){
           if(!ar.contains(i)){
               t=false;
           }
       }
       if(t==true){
           System.out.println("I become the guy.");
       }
       else{
           System.out.println("Oh, my keyboard!");
       }
  }
  
  }      
