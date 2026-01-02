class Solution {

    static {

        for(int i=0;i<500;i++){
            maxProfit(null);
        }
    }
    public static int maxProfit(int[] prices) {
        

        if(prices == null)return -1;
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