package Loops;

public class Ass9 {
  public static void main(String[] args) {
	//9. Write a program to find the prime or not.
     
	  int n=3;
	  int count=0;
	  if(n>1) {
		  for(int i=1;i<=n;i++) {
		  if(n%i==0) {
			  count++;
		  }
		  }
		 if(count==2) {
			 System.out.println("the given number is prime");
		 }
		 else {
			 System.out.println("the given number is not prime");
		 }
	  }
	  else {
		  System.out.println("not prime number");
	  }
	  
}
}
