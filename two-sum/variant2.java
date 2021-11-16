class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numslen_1 = nums.length;
        int numslen = numslen_1--;
        for (int i = 0; i <= numslen_1; ++i) {
            int rest = target - nums[i];
            for (int j = i + 1; j < numslen; ++j) {
                if (rest == nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}