class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
		for (int j = 0; j < nums.length; j++) {
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[j] > nums[i]) {
					count++;
				}
			}
			output[j] = count;
		}
		return output;
    }
}
