class Solution {
    int[] copy;
    List<Integer> lst;
    public Solution(int[] nums) {
        copy=new int[nums.length];
        lst=new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            copy[i]=nums[i];
            lst.add(nums[i]);
        }
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return copy;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random rand=new Random();
        int[] ans=new int[copy.length];
        for (int i=0;i<ans.length;i++) {
            if (lst.size()>0) {
                int n=rand.nextInt(lst.size());
                ans[i]=lst.get(n);
                lst.remove(n);
            }
        }
        for (int i=0;i<copy.length;i++) {
            lst.add(copy[i]);
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
