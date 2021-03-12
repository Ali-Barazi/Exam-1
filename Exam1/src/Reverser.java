import java.util.ArrayList;
import java.util.Collections;

public class Reverser extends Numbers {
   
      private ArrayList<Integer> list= new ArrayList<Integer>();
      //
      
   	// TODO
   	// return the ArrayList that has the elements 
   	// that Numbers has in int[] nums,
   	// but in the reversed order
   	public ArrayList<Integer> reverse(){
   		// i used stack overflow to figure out whether i should do i>0 or i>=0
   		if (list.size()==0 || list==null) {
   			return null;
   		}
   		ArrayList<Integer> x = new ArrayList<Integer>(); 
         for(int i=list.size(); i>=0; --i) 
         {
        	 x.add(list.get(i));
         }
         return x;
	   }
	   
	   // TODO 
	   // find the second biggest value
	   // keep in mind that the biggest value could be include more 
	   // than once
	   public int findSecondBiggest()
	  //https://stackoverflow.com/questions/1330288/how-to-make-a-separated-copy-of-an-arraylist
	   {
		   if (list.size()==0 || list==null) {
	   			return 0;
	   		}
		   ArrayList<Integer> x= new ArrayList<Integer>();
		   x.addAll(list);
		   
		   
		   for(int i=list.size()-2; i>=0; --i) 
	         {
	        	 if(x.get(i)!=x.get(list.size()-1))
	        	 {
	        		 return x.get(i);
	        	 }
	         }
	   	   return x.get(list.size()-1);
	   }	 
}
