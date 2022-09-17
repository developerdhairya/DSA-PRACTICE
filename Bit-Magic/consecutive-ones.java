import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        ps.print(consecutive(n));
    }


    public static int consecutive(int n){
        // sparse means no consecutive ones
        int count=0;
        while(n!=0){
            n=n&(n<<1);
            count++;
        }
        return count;
    
    }

}