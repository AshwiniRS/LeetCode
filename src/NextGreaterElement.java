import java.util.HashMap;

/*You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
 * 
 *Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1. 
 * 
 */


public class NextGreaterElement {
	  public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		 int[] result = new int[findNums.length];
		 int k=0;
		 HashMap<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
		 for(int i=0;i<nums.length;i++){
			 numsMap.put(nums[i], i);
		 } 
		 for(int i=0;i<findNums.length;i++){
			int val = numsMap.get(findNums[i]);
			while(val<nums.length){
				if(findNums[i]<nums[val]){
					result[k]=nums[val];
					k++;
					break;
				}
				else val++;
			}if(val==nums.length){
				result[k]=-1;
				k++;
			}
		 }
		 
		 return result;
		 
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] findNums = {3,1,5,7,9,2,6};
		int[] nums = {1,2,3,5,6,7,9,11};
		int[] result = nextGreaterElement(findNums, nums);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}

}
