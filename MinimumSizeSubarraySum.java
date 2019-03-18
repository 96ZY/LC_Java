class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int L = nums.length;
        if(L==0){
            return 0;
        }
        
        int Lmin=L+1;
        
        /*

        for(int i =0;i<L;i++){
            if(nums[i]>s||nums[i]==s){
                return 1;
            }
        }
        */
        int nums2[]=new int[L];
        for(int i =0;i<L;i++){
            nums2[i]=nums[i];
        }
        Arrays.sort(nums2);
        
        
        int low=0;
        int high=L-1;
        
        while(low<high||low==high){
            int mid=low+(high-low)/2;
            //System.out.println("mid="+mid);
            if(nums2[mid]==s||nums2[mid]>s){
                //System.out.println("wc");
                return 1;
            }else{
                low=mid+1;
            }
        }
        
        
        for(int p1=0;p1<L-1;p1++){  
            int sum = nums[p1];
            for(int p2=p1+1;p2<L;p2++){
                sum = sum + nums[p2];
                if(sum>s||sum==s){
                    if(p2-p1+1<Lmin){
                        Lmin=p2-p1+1;
                    }
                }
            }
            
        }
        
        if(Lmin<L+1){
            return Lmin;
        }
        
        return 0;

    }
}
