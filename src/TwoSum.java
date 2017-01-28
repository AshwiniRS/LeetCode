/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * 
 */


import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hset = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0; i<nums.length;i++){
            int diff = target - nums[i];
            if(!hset.containsKey(diff)){
                hset.put(nums[i],i);
            }
            else{
                 result[0] = hset.get(diff);
                 result[1] = i;
            }
        }
        return result;
    }
    public static void main(String[] args){
    	int[] nums = {2,7,11,15};
    	int target = 9;
    	int[] result = twoSum(nums,target);
    	System.out.println(result[0] + " " + result[1]);
    }
}