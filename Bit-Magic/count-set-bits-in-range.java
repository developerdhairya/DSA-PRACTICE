import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        ps.print(count(n));
    }

    //Take example of 11 to remember

    public static int count(int n){

        if(n==0){
            return 0;
        }

        int x=snp2(n);
        int y=(1<<x);

        int a=x*y/2; // count bits above y
        int b=1;     // bits in y
        int c=(n-y)+count(n-y); //bits below y

        return a+b+c;
    
    }


    public static int snp2(int n){
        int i=0;
        while((1<<i)<n){
            i++;
        }
        if(i==0 || n==(1<<i)){
            return i;
        }
        return --i;
    }

}