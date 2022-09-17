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
            return true;
        }
        return false;
    }
}