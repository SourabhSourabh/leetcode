class Solution {

    void swap(int arr[] , int i , int j){

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void nextPermutation(int[] nums) {

        int ind1 = -1;

        int n = nums.length;
        for(int i=n-1;i>0;i--){

            if(nums[i]>nums[i-1]){
                ind1=i-1;
                break;
            }
        }

        if(ind1==-1){
            int low =0;
            int high = n-1;
            while(low<high){

                swap(nums,low++,high--);
            }

            return;
        }

        int ind2=0;
        for(int i=n-1;i>=0;i--){

            if(nums[i]>nums[ind1]){ind2=i;
            break;}

        }

        swap(nums,ind1,ind2);

        int low = ind1+1;
        int high = n-1;

        while(low<high){

        swap(nums,low++,high--);
        }



        
    }
}