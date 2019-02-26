//Just the Solution part
//Solution1 is by brute force
//Solution2 is by Binary Search

class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int L=nums.length;
        if(L==0){
            return 0;
        }
        if(L==1){
            if(target<nums[0]){
                return 0;
            }
            if(target>nums[0]){
                return 1;
            }  
        }
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[L-1]){
            return L;
        }
        
        for(int i=0;i<L;i++){
            if(nums[i]==target){
                return i;
            }
            if(i<L-1){
                 if(nums[i]<target&&nums[i+1]>target){
                     return i+1;
                 }   
            }
        
        }
        return 0;
    }
}
