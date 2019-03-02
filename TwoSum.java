//use hash map
class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int L=nums.length;
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<L;i++){
            map.put(nums[i],i); 
        }
        for(int i=0;i<L;i++){
            int comp = target-nums[i];
            if(map.containsKey(comp)&&map.get(comp)!=i){
                return new int []{i, map.get(comp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    /* official code by leetcode
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}*/
}
