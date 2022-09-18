import java.util.*;
import java.io.*;
//Leaders in array
class Main{
    static Scanner sc=new Scanner(System.in);
    static PrintStream ps=System.out;
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list=leaders(arr);
        for(int ele:list){
            ps.print(ele+" ");
        }
    }
    public static ArrayList<Integer> leaders(int[] arr){
        int n=arr.length;
        int val=Integer.MIN_VALUE;
        int[] temparr=new int[n];
        for(int i=n-1;i>=0;i--){
            val=Math.max(val,arr[i]);
            temparr[i]=val;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==temparr[i]){
                list.add(arr[i]);
            }
        }
        return list;

    }
}