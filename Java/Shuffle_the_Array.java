class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n; 
        int o = 0;
        int[] ans = new int[nums.length];

        while (o < nums.length) {
            ans[o++] = nums[i++];
            ans[o++] = nums[j++];
        }

        return ans;
    }
}
