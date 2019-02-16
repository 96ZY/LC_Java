class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(digits[len-1]<9){
            int pluseOne[]=new int[len];
            for(int i=0;i<len-1;i++){
                pluseOne[i]=digits[i];
}
            pluseOne[len-1]=digits[len-1]+1;
            return pluseOne;
                
}else{
            int mark=len-1;
            for(int i=len-1;i>=0;i--){
                if(digits[i]!=9){
                    mark=i;
                    break;
}
}
             if(mark==len-1){
                 int pluseOne[]=new int[len+1];
                 pluseOne[0]=1;
                 for(int i=1;i<=len;i++){
                     pluseOne[i]=0;
}
                 return pluseOne;
}else{
                 int pluseOne[]=new int[len];
                 for(int i=0;i<mark;i++){
                     pluseOne[i]=digits[i];
}
                 pluseOne[mark]=digits[mark]+1;
                 for(int i=mark+1;i<len;i++){
                     pluseOne[i]=0;
}
                 return pluseOne;
}
            
}
    }
}
