class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n];
        int[] res = new int[n];
        
        if(k > n){
            Arrays.fill(res, -1);
            return res;                
        }
        
        long total = (2*k) + 1;
        
        //prefixSum
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }
        
        //fill valid part of array
        for(int i = k; i < n-k; i++){
            res[i] = (int)((prefix[i+k] - prefix[i-k] + nums[i-k])/total);
        }
        
        //fill first invalid part of array
        for(int i = 0; i< k; i++){
            res[i] = -1;
        }
        
        //fill last invalid part of array        
        for(int i = n-1; i >= n-k ; i--){
            res[i] = -1;
        }  
        
        return res;
        
    }
}