package Array;

public class Ass1and2 {
   //1. Write a function to add integer values of an array

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.println("the index of "+arr[i]+" is "+i);
		}
		System.out.println("sum of all element in array "+sum);
		
	//2. Write a function to calculate the average value of an array of integers
		
	     int a[]= {1,2,3,4,5};
	     double avg;
	     int s=0;
	     int len=a.length;
	     for(int j=0;j<a.length;j++) { 
	    	 s=s+a[j];
	    	 
	     }
	     avg=s/len;
	    System.out.println(avg); 
	}
	
}
