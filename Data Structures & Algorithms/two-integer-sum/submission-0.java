class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int n = nums.length;
        int rem ;
        for(int i = 0;i<n;i++){
            rem = target-nums[i];
            for(int j=i+1;j<n;j++){
                if(nums[j]==rem){
                    output[0]=i;
                    output[1]=j;
                    break ;
                }
            }
        }
        return output;
        

    }
}
