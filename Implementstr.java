//just the solution part
// 双指针法
class Solution {
    public int strStr(String haystack, String needle) {
        int L=haystack.length();
        int l=needle.length();
        if(l==0){
            return 0;
        }
        if(L==0){
            return -1;
        }

        for(int i=0;i<L+1-l;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(l==1){
                    return i;
                    
                }
                for(int j=1;j<l;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                    if(j==l-1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
