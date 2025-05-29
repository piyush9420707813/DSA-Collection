class Solution {
    public static boolean  twoSum(int[] nums, int target) {
        //two pointer approach
        int Fn = 0;
        int Ln = nums.length-1;
        if (nums[Fn]+nums[Ln]==target){
            return true;
        }
        while(Fn<Ln){
            if (nums[Fn]+nums[Ln]<target){
                Fn++;

            }else{
                Ln--;
            }
            
    }
    return false;

        
    }
    public static void main(String[] args) {
        int[] num ={2,7,11,15};
        System.err.println(twoSum(num, 90));

    }


}