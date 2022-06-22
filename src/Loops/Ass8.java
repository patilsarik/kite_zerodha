package Loops;

public class Ass8 {
//8. Write a program to find Armstrong number or not
        
	public static void main(String[] args) {
		int n=370;int temp;
		int d;int sum=0;
		temp=n;
		while(n>0) {
			d=n%10;//0,7,3
			n=n/10;//37,3,0
			sum=sum+ d*d*d;//0,0+343,343+27=370
			
		}
		if(temp==sum) {
			System.out.println("the number is armstrong "+temp);
		}
		else {
			System.out.println("the number is not armstrong "+temp);
		}
		
}
}
