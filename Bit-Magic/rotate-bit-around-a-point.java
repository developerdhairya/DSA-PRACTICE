import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int d=sc.nextInt();
        ArrayList<Integer> list=rotate(n,d);
        for(int ele:list){
            ps.print(ele+" ");
        }

    }
    public static ArrayList<Integer> rotate(int n,int d){
        ArrayList<Integer> output=new ArrayList<>();
        int x=(int)Math.pow(2,16)-1;
        d%=16; //incase d is greater than 16
        output.add( (x & (n<<d))  |  n>>(16-d)    );
        output.add( n>>d   | (x & n<<(16-d)) );
        return output;
    }
}