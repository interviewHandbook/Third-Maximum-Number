package com.interviewprep.leetcode.easy.thirdmaximumnumber;

public class FirstApproach {

	public static void main(String[] args) {
		
	//	int[] nums = {3,2,1};
	//	int[] nums = {2,1,-2147483648};
		int[] nums = {2,2,3,1};
	//	int[] nums = {3,2,4};
		
		FirstApproach fa = new FirstApproach();
		int tMax = fa.thirdMax(nums);
		
		System.out.println(tMax);
	}
	
	  public int thirdMax(int[] nums) {
	        
		  // initialize the three max variables to min val
		  int max = Integer.MIN_VALUE;
		  int secondMax = Integer.MIN_VALUE;
		  int thirdMax = Integer.MIN_VALUE;
		  
		  int curNum = 0;
		  boolean isTmax = false;
		  
		  // find max val
		  for(int i=0; i<nums.length;i ++) {
			  
			  curNum = nums[i];
			  
			  if(max <= curNum) {
				  max = curNum;
				
			  }	  
			  
		  }
		  
		  /*
		   * Now iterate the array again while ignoring the max val above.
		   * The max val of this array will be the second max
		   */
		  for(int i=0; i<nums.length;i ++) {
			  
			  curNum = nums[i];
			  if(curNum != max) {
				  
				  if(secondMax <= curNum) {
					  secondMax = curNum;
					
				  }
			  }
		  }
		  
		  /*
		   * Iterate the array again while ignoring the max and second max val above.
		   * The max val of this array will be the third max
		   */
		  for(int i=0; i<nums.length;i ++) {
			  
			  curNum = nums[i];
			  if(curNum != max  &&  curNum != secondMax) {
				  
				  if(thirdMax <= curNum) {
					  thirdMax = curNum;
					  isTmax = true;
				  }
			  }
			  
		  }
		  
		  if(!isTmax) {
			  thirdMax = max;
		  }
		  
		  return thirdMax;
	    }

}

