class Solution {
    public String longestCommonPrefix(String[] strs) {
        

        int n = strs.length;
        Arrays.sort(strs);
        int ans=0;

        for(int i=0;i<Math.min(strs[0].length(),strs[n-1].length());i++){

            if(strs[0].charAt(i)==strs[n-1].charAt(i)){
                ans++;
            }
            else {
                break;
            }
        }

        if(ans==0) return "";
        return strs[0].substring(0,ans);
    }
}