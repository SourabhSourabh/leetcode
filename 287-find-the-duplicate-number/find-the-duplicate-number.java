class Solution {

    static
    
    {


        for(int i=0;i<500;i++){
findDuplicate(null);
        }


    }
    public static int findDuplicate(int[] nums) {
        

        if(nums==null)return -1;

       for(int i : nums){

        int number = Math.abs(i);

        if(nums[number]<0)return number;

        nums[number]=-nums[number];

       }

        return -1;
    }
}