class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int right = 1,temp = 0;
        for(int i = 0;i<nums.length - 1;i++){
            if(nums[i] == nums[right]){
                temp = nums[i];
            }
            right++;
        }
        return temp;
    }
}