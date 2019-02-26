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

class Solution2 {
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
        
        int low=0;
        int high=L-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                if(nums[mid+1]>target){
                    return mid+1;
                }
                low=mid+1;
            }
            else{
                if(nums[mid-1]<target){
                    return mid;
                }
                high=mid-1;
            }
        }
        return 0;
    }
}
