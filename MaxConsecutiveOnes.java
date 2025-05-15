package javaProgramsPkg;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
      int count=0;
      int maxConsecutiveOnes=0;
      
       int[] arr = {0,0,1,0,1,1,1,1,1,0,1,1};
       
       
       for(int i=0;i<arr.length;i++){
           if(arr[i]==1){
               count++;
               maxConsecutiveOnes = Math.max(count,maxConsecutiveOnes);
           }else{
               count=0;
           }
       }
       
       System.out.println(maxConsecutiveOnes);
      
    }
}