class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            
            if(set.contains(i) && !list.contains(i)){
                list.add(i);
            }
        }

        int res [] = new int[list.size()];
            int k=0;
          for(int i : list){
            
            res[k++]=i;
        }

        return res;
    }
}