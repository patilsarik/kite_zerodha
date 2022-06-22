package Array;

import java.util.Arrays;

public class Ass5and6 {
   public static void main(String[] args) {
	 //  5. Write a function to remove a specific element from an array

	   
	   int a[]= {20,10,30,40,50};
	   System.out.println("original array "+Arrays.toString(a));
	   int removerindex=2;
	   
	   for(int i=removerindex;i<a.length-1;i++){
		  a[i]=a[i+1];
	   }
	   System.out.println("after removing index "+Arrays.toString(a));



//6. Write a function to copy an array to another array

//        int[] x= {1,2,3,4};
//        
//        //int []y= {};
//        int y[]=new int [x.length];
//        
//        for(int i=0;i<x.length;i++) {
//        	y[i]=x[i];
//        	//System.out.print(y[i]);
//        }
//         System.out.println();
//        for(int i=0;i<x.length;i++) {
//        	System.out.print(x[i]);
//        }
//       System.out.println();
//        
//        for(int i=0;i<x.length;i++) {
//        	System.out.print(y[i]);
//        }



}
}





