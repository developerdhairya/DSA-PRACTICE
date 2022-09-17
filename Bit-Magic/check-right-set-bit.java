import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        ps.print(helper(n));
    }

    public static int helper(int n){
        if(n==0){
            return 0;
        }
        n=n&(~(n-1));
        int zc=(int)(Math.log(n)/Math.log(2));
        return zc+1;
    }
}