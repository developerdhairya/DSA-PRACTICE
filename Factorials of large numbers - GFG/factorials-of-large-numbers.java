//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static void multiply(ArrayList<Integer> list,int n){
        int carry=0;
        for(int i=0;i<list.size();i++){
            int val=list.get(i)*n+carry;
            carry=val/10;
            list.set(i,val%10);
        }
        while(carry!=0){
            list.add(carry%10);
            carry/=10;
        }
    }
    
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> list=new ArrayList<>();
        int num=N;
        while(num!=0){
            list.add(num%10);
            num/=10;
        }
        for(int i=N-1;i>=2;i--){
            multiply(list,i);
        }
        Collections.reverse(list);
        return list;
    }
}

    // vector<int> factorial(int n){
        
    //     vector<int> vec;
    //     int num=n;
    //     while(num!=0){
    //         vec.push_back(num%10);
    //         num/=10;
    //     }
    //     for(int i=n-1;i>=2;i--){
    //         multiply(vec,i);
    //     }
    //     reverse(vec);
    //     return vec;
    // }


    // void multiply(vector<int>& vec,int num){
    //     int carry=0;
        
    //     for(int i=0;i<vec.size();i++){
    //         int prod=vec[i]*num+carry;
    //         carry=prod/10;
    //         vec[i]=prod%10;
    //     }
        
        
    //     while(carry!=0){
    //         vec.push_back(carry%10);
    //         carry/=10;
    //     }
        
        
    // }