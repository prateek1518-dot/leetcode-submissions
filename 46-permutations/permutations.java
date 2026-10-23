class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums,curr,ans,used);
        return ans;
    }
    void backtrack(int[] nums,List<Integer> curr,List<List<Integer>> ans,boolean[] used){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            curr.add(nums[i]);
            used[i]=true;
            backtrack(nums,curr,ans,used);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}