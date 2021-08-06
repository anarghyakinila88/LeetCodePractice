package LeetCodePractice;

import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];  //pointer
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(); //hashmap & create object
        for(int i=0; i<nums.length; i++) {
            if (map.containsKey(target - nums[i])) { //check for number in hashtable
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}