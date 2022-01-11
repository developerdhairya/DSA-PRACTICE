class Solution {
    
    
    
    public int reverse(int num){
        boolean isNegative=false;
        if (num<0){
            num*=-1;
            isNegative=true;
        }
        long newNum=0;
        int rem;
        int i=0;

        while (num>0){
            rem=num%10;
            newNum=(newNum*10)+rem;
            num/=10;
            i+=1;
        }

        if (newNum< Integer.MAX_VALUE && newNum>Integer.MIN_VALUE){
            return isNegative?-1*(int)newNum:(int)newNum;
        }

        return 0;



    }
    
    
}