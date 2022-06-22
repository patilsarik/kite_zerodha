package Inheritance;

public class SubClassC extends SubClassB{
int var3=30;
public void methodC1() {
	System.out.println("class C method 1");
		super.same();
	}
	public void methodC2() {
		System.out.println("class C method 2");
		
	}
	public void same() {
		System.out.println("class C method same");
		
	}
	
	
	
}
