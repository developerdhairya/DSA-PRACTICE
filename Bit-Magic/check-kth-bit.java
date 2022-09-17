import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int k=sc.nextInt();
        ps.print(helper(n,k));
    }

    public static boolean helper(int n,int k){
        // int mask=1<<k-1;  if k starts from 1;
        int mask=1<<k;
        int output=n&mask;
        if(output==0){
            return false;
        }
        return true;
    }
}