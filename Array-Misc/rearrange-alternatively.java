import java.util.*;
import java.io.*;
// Rearrange sorted array alternatively in O(1) space
// It can be easily done in O(n) by 2 pointer technique
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rearrange(arr);
        for(int ele:arr){
            ps.print(ele+" ");
        }
    }
    public static void rearrange(int[] arr){
        int n=arr.length;
        int mini=0;
        int maxi=n-1;
        int p=arr[maxi]+1;
        int i=0;
        while(i<n){
            if(i%2==0){
                arr[i]+=p*(arr[maxi--]%p);
            }else{
                arr[i]+=p*(arr[mini++]%p);
            }
            i++;
        }

        for(int k=0;k<n;k++){
            arr[k]/=p;
        }
    } 
}