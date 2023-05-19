/* Question 8: Find First and Last Position of Element in Sorted Array
Skill Mapping: Medium
Description: Solve the LeetCode Problem given as a link below - 
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/

class Question8 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int leftIndex = binarySearch(nums, target, true);
        
        // If the target is not found, return [-1, -1]
        if (leftIndex == nums.length || nums[leftIndex] != target)
            return result;
        
        int rightIndex = binarySearch(nums, target, false) - 1;
        
        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;
    }
    
    // Helper method for binary search
    private int binarySearch(int[] nums, int target, boolean findLeft) {
        int left = 0;
        int right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > target || (findLeft && nums[mid] == target))
                right = mid;
            else
                left = mid + 1;
        }
        
        return left;
    }
}
