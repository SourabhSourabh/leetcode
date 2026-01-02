class Solution {
    public int findDuplicate(int[] nums) {
        

       for(int i : nums){

        int number = Math.abs(i);

        if(nums[number]<0)return number;

        nums[number]=-nums[number];

       }

        return -1;
    }
}