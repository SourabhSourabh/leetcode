class Solution {
    public int countCommas(int n) {


        // 10^3 - 1000
        // 10^4 - 10,000 - 1 comma
        // 10^5 - 100,000 - 1 comma if num <=999 return 0 ; else return 1002 - 1000 +1;


        if(n<=999){
            return 0;
        }

        return n - 999;
        
    }
}