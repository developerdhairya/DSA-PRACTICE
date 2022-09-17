import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        ps.print(sparse(n));
    }


    public static boolean sparse(int n){
        // sparse means no consecutive ones
        return (n & (n<<1)) == 0;
        
    
    }

}