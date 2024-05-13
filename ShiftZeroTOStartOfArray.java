package com.programs;

public class ShiftZeroTOStartOfArray {

	public static void main(String[] args) {
	   int[] nums = {78,0,45,0,8,87,98,0,0,4,0,0};

	   int i,temp,j;
	   int startIndex=0;
	   
	   for(i=1;i<nums.length;i++) {
		   if(nums[i]==0) {
			   for(j=i;j>startIndex;j--) {
				   temp=nums[j];
				   nums[j]=nums[j-1];
				   nums[j-1]=temp;
			   }
			   startIndex++;
		   }
	   }
	   
	   for(int n: nums) {
		   System.out.print(n + " ");
	   }
	   
	   
	}

}
