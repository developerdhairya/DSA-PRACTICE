import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        ps.print(helper(n));
    }

    public static boolean helper(int n){
        
        if((n&(n-1))==0){
            int output=(int)(Math.log(n)/Math.log(2));
            return output%2==0;
        }
        
        return false;
    }
}