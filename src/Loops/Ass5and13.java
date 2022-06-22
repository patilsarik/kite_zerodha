package Loops;

public class Ass5and13 {
  //Q5 and Q13 are same
	//13. Program for multiple if else statement(Largest number in 10,20 and 30)
	//5. Write a program to print largest number among three numbers.
public static void main(String[] args) {
	
	int a=10,b=20,c=30;
	
	if(a==b &&b==c) {
		System.out.println("all r equals");
	}
	else {
		if(b==c &&(a>c||a>b)) {
			System.out.println("a is greter "+a);	
		}
		if(a>b && a>c) {
			System.out.println("a is greter " +a);
		}
		else {
			if(a==c &&(b>a||b>c)) {
				System.out.println("b is greter "+b);
			}
			if(b>a && b>c) {
				System.out.println("b is greter "+b);
			}
			
			else {
				if(a==b &&(c>a || c>b)) {
					System.out.println("c is greter "+c);	
				}
				if(c>a && c>b) {
					System.out.println("c is greter "+c);
					
				}
			}
		}
	}
	
}
}
