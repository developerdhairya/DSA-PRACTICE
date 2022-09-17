import java.util.*;
import java.io.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ps.print(helper(arr));
    }

    public static long helper(int[] arr){
        long output=0;
        for(int i=0;i<=31;i++){
            int mask=1<<i;
            long set=0;
            long unset=0;
            for(int ele:arr){
                if((mask&ele)==0){
                    unset++;
                }else{
                    set++;
                }
            }
            output+=set*unset*2;
        }

        return output;

    }
        
        
}