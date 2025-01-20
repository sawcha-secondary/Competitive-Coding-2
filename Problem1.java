import java.util.HashMap;
import java.util.Map;

//Time Complexity: O(n)
//Space Complexity O(n)
//Yes the code ran successfully in leetcode
//No problem faced
//1. Two Sum


class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();

        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (numMap.containsKey(diff)) {
                return new int[] { numMap.get(diff), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;

    }
 
 }
 