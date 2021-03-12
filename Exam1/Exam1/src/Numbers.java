import java.util.*;
import java.util.Arrays;

public class Numbers {
   
   private int[] nums;
   
   public void setNums(int[] nums) {
      this.nums = nums;
   }
   
   public int[] getNums() {
      return nums;
   }
   
   public int findMax(){
      /* Type your code here. */   
	   int largest=nums[0];
	   int temp;
	   for(int i=1; i< nums.length; ++i)
	   {
		   if (largest<nums[i])
		   {
			   temp=largest;
			   largest= nums[i];
			   nums[i]= temp;
		   }
	   }
	   return largest;
   }
   
   // Fill array nums with pseudo-random integers (0-999) with a seed value
   public void fillRandomly(int seed, int size){
      Random rand = new Random(seed);
      nums = new int[size];
      for(int i = 0; i < nums.length; ++i){
         nums[i] = rand.nextInt(1000);
      }
   }   
}
