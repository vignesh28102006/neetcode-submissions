class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(i!=j){
                    if(nums[i]==nums[j]){
                        ans=true;
                        break;
                        
                    }
                    else{
                        continue;
                    }
                }
            }
        }

        return ans;
        
    }
}