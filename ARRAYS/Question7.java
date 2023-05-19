/* Question 7: Remove Element
Skill Mapping: Basic
Description: Solve the LeetCode Problem given as a link below - 
https://leetcode.com/problems/remove-element/ */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the element to the front
                k++; // Increment the count of elements not equal to val
            }
        }
        
        return k;
    }
}
