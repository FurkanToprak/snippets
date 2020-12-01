class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] exists = new boolean[nums.length + 1];
        int dup = 0;
        int missing = 0;
        int i = 0;
        for(; i < nums.length; ++i) {
            if (!exists[nums[i]])
                exists[nums[i]] = true;
            else dup = nums[i];
        }
        for(; i < nums.length; ++i) {
            exists[nums[i]] = true;
        }
        for(int j = 1; j < exists.length; ++j) {
            if(!exists[j]) {
                missing = j;
                break;
            }
        }
        return new int[]{dup, missing};
    }
}
