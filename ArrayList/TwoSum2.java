class Solution {
    public static void twoSum(int[] nums, int target) {
        int Fn = 0;
        int Ln = nums.length - 1;

        while (Fn < Ln) {
            int sum = nums[Fn] + nums[Ln];
            if (sum == target) {
                System.out.println("[" + Fn + ", " + Ln + "]");
                return;
            } else if (sum < target) {
                Fn++;
            } else {
                Ln--;
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        twoSum(num, 9); // Output: [2, 7]
    }
}
