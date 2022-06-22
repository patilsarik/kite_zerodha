package Array;

public class Ass9and10and11 {
//9. Write a function to reverse an array of integer values

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6};
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(" "+array[i]);
		}
		
		
		//10. Write a function to find the duplicate values of an array

		 int[] a = {1, 2, 5, 5, 6, 6, 7, 2, 1};
		 
	        for (int i = 0; i <= a.length-1; i++)
	        {
	            for (int j = i+1; j < a.length; j++)
	            {
	                if ((a[i] == a[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+a[j]);
	                }
	            }
	}
	   //11. Write a program to find the common values between two arrays
        int[] a1= {1,2,3,4,5};
        int[] a2= {2,4,6,3,9,1};
        
        for(int i=0;i<a1.length;i++) {
        	for(int j=0;j<a2.length;j++) {
        		if(a1[i]==a2[j]) {
        			System.out.print(" "+a1[i]);
        		}
        	}
        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	
}
}
