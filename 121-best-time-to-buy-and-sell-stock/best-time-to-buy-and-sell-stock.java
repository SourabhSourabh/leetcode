class Solution {
    public int maxProfit(int[] prices) {
        
        int minSoFar = prices[0];
        int res = -1;
        for(int i : prices){


            if(i<minSoFar)minSoFar=i;


            int prof = i - minSoFar;
            res = Math.max(res,prof);
        }

        return res;
    }
}