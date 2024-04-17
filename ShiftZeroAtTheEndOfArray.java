class ShiftZeroAtTheEndOfArray {
    public static void main(String[] args) {
       int[] nums = {0,45,0,8,87,98,0,0,4};
       int size = nums.length;
       int nz=0,z=0;
       while(nz<size){
           if(nums[nz]!=0){
               int temp = nums[nz];
               nums[nz] = nums[z];
               nums[z] = temp;
               nz++;
               z++;
           }else{
               nz++;
           }
           
       }
       for(int n:nums){
           System.out.print(n+" ");
       }
    }
}