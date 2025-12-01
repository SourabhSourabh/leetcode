class Solution {
    public int findDuplicate(int[] nums) {

        for (int i : nums) {
            int trial = Math.abs(i);

            if (nums[trial] < 0) {
                return trial;
            } else {
                nums[trial] = -nums[trial];
            }

        }
        return -1;

    }
}