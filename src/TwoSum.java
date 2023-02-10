/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * **/



class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indexArr = new int[2];

        for(int i = 0 ; i<nums.length ; i++){
            int tempA = nums[i];
            for(int j = 0 ; j<nums.length ; j++){
                if(i==j){
                    continue;
                }
                int tempB = nums[j];
                if (tempA + nums[j]== target ){
                    indexArr[0] = i;
                    indexArr[1] = j;
                    return indexArr ;
                }
            }
        }
        return indexArr ;
    }
}
