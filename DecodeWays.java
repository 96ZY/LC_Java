class Solution {
    public int numDecodings(String s) {
        int L = s.length();
        if(s.charAt(0)=='0'){
            return 0;
        }
        if(L==1){
            return 1;
        }                
        for(int i=0;i<L;i++){
            
            if(s.charAt(i)=='0'){
                if(i<L-1){
                    if(s.charAt(i+1)=='0'){
                        return 0;
                    }
                }
                if(s.charAt(i-1)!='2'&&s.charAt(i-1)!='1'){
                    return 0;
                }
            }
        }
        if(L==2){
            int n = Integer.parseInt(s);
            if(n>26||n==10||n==20){
                return 1;
            }else{
                return 2;
            }
        }
        int dp[]=new int[L];
        /*
        if(s.charAt(0)>'2'||s.charAt(0)=='0'){
            dp[1]=1;
        }else{
            if(s.charAt(0)=='2'&&s.charAt(1)>6){
                dp[1]=1;
            }else{
                dp[1]=2;
            }
        }*/
        
        dp[0]=1;
        if(s.charAt(0)=='1'){
            if(s.charAt(1)=='0'){
                dp[1]=1;
            }else{
                dp[1]=2;
            }
        }else if(s.charAt(0)=='2'){
            if(s.charAt(1)=='0'||s.charAt(1)>'6'){
                dp[1]=1;
            }else{
                dp[1]=2;
            }
        }else{
            dp[1]=1;
        }
        
        for(int i=2;i<L;i++){
            if(s.charAt(i)=='0'){
                if(s.charAt(i-1)=='1'||s.charAt(i-1)=='2'){
                    dp[i]=dp[i-2];
                }else{
                    return 0;
                }
            }else{
                if(s.charAt(i-1)=='1'||(s.charAt(i-1)=='2'&&s.charAt(i)<='6')){
                    dp[i]=dp[i-1]+dp[i-2];
                }else{
                    dp[i]=dp[i-1];
                }
            }

            /*
            if(s.charAt(i-1)=='0'){
                dp[i]=dp[i-2];
            }else if(s.charAt(i-1)=='1'){
                if(s.charAt(i)=='0'){
                    dp[i]=dp[i-2];
                }else{
                    dp[i]=dp[i-2]*2;
                }
            }else if(s.charAt(i-1)=='2'){                                
                if(s.charAt(i)=='0'||s.charAt(i)>'6'){
                    dp[i]=dp[i-2];
                }else{
                    dp[i]=dp[i-2]*2;
                }
            }else{
                dp[i]=dp[i-2];
            }*/

        }
        return dp[L-1];
    }
}
