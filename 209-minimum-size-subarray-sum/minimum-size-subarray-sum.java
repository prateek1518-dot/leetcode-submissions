class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int a= 0;
        int sum=0;
        int minlen = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(sum>=target){
                minlen = Math.min(minlen,i-a+1);
                sum -=nums[a];
                a++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}