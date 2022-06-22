package Loops;

public class Ass10 {
  //10. Write a program to palindrome or not.
   public static void main(String[] args) {
	
	   int n=209; int rev; int temp;
	   temp=n;int sum = 0;
	   while(n>0) {
		   rev=n%10;
		   sum=(sum*10)+rev;
		   n=n/10;
		   //System.out.print(sum);
	   }
	   if(temp==sum) {
		   System.out.println("number is palindrom");
	   }
	   else {
		   System.out.println("number not palindrom");
	   }
	   
   
   }
}



