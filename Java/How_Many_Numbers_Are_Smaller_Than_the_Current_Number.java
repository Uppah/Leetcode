class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int current = 0;
        int[] ans = new int[nums.length];
        int lessThan = 0;

        for(int i = 0; i < nums.length; i++){
            current = nums[i];
            lessThan = 0;
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }

                if(current > nums[j]){
                    lessThan++;
                }
                ans[i] = lessThan;
            }
        }
        return ans;
    }
}
