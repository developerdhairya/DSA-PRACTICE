import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int m=sc.nextInt();
        ps.print(helper(n,m));
    }

    public static int helper(int n,int m){
        if(n==m){
            return 0;
        }
        int num=n^m;
        num=num&(~(num-1));
        return (int)(Math.log(num)/Math.log(2))+1;
    }
}