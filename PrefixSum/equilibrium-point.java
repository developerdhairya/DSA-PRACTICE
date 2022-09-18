import java.util.*;
import java.io.*;
// Value at equilibrium pont
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ps.print(equilibrium(arr));
    }
    public static int equilibrium(int[] arr){
        int n=arr.length;
        int[] parr=new int[n];
        int psum=0;
        for(int i=0;i<n;i++){
            psum+=arr[i];
            parr[i]=psum;
        }
        if(parr[n-1]-parr[0]==0){
            return arr[0];
        }
        for(int i=1;i<=n-1;i++){
            if(parr[i-1]==parr[n-1]-parr[i]){
                return arr[i];
            }
        }
        return -1;
        
    }
}