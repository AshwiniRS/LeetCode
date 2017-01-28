/*
 * 
 * 
 * public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
 * 
 * 
 * 
 * var removeDuplicates = function(nums) {
    
    for (var i = 0; i < nums.length-1; i++) {
        while (nums[i] == nums[i+1]) {
             nums.splice(i, 1);
        }
    }
    
    return nums.length;
};
 * 
 */


public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index=nums.length;
        int len=nums.length;
        int count=0;
        if(nums.length==0) return 0;
        if(nums.length==1) return nums.length;
        for(int i=0;i<len-1;i++){
            if(nums[i]==nums[i+1]){
            	count=1;
                index=i+1;
                int k=index;
                while(k+1<len && nums[k]==nums[k+1]){
                    k++;
                    count++;
                }
                for(int j=k+1;j<len;j++){
                    nums[index]=nums[j];
                    nums[j]=0;
                    index++;
                }
                if(nums.length==2) return nums.length-1;
 
                len=len-count;
            }
        }
        return len;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int[] nums = {-3,-1,-1,0,0,0,0,0};
    	System.out.println(removeDuplicates(nums));
	}
    
}



