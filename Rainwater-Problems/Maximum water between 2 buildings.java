import java.util.*;
import java.io.*;
// Maximum water by removing n-2 buildings
// Also known as maximum candies b/w 2 books
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ps.print(sol(arr));
    }
    public static int sol(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        int maxvol=0;
        while(i<j){
            // In this we do multiply by (i-j-1) and in container with most water we do by (i-j)
            int currvol=Math.min(arr[i],arr[j])*(j-i-1);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
            maxvol=Math.max(maxvol,currvol);
        }
        return maxvol;
    }
}