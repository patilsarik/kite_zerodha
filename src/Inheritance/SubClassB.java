package Inheritance;

public class SubClassB extends SuperClassA{
int var2=20;
	public void methodB1() {
		System.out.println("class B method 1");
		super.same();
		
	}
	public void methodB2() {
		System.out.println("class B method 2");
		
	}
	public void same() {
		System.out.println("class B method same");
		
	}
	
	
	
}
