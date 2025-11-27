class Solution {
    public int findDuplicate(int[] nums) {
        

Set<Integer> set = new HashSet();

for(int in : nums){

    if(set.isEmpty() || !set.contains(in)){
        set.add(in);
        continue;
    }

    if(set.contains(in)){
        return in;
    }
}

return -1;
    }
}