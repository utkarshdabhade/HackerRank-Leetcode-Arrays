/* Question 6:  Remove Duplicates from Sorted Array
Skill Mapping: Basic
Description: Solve the LeetCode Problem given as a link below - 
https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */


public class Question6 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        
        int i = 1;
        int count = 1;
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                count++;
                i++;
            }
        }
        
        return count;
    }
}

