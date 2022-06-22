package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		SuperClassA a=new SuperClassA();
		a.methodA1();
		a.methodA2();
		a.same();
		System.out.println(a.var1);
		
		SubClassB b=new SubClassB();
		b.methodB1();
		b.methodB2();
		b.same();
		a.same();
		System.out.println(b.var2);
		
		SubClassC c=new SubClassC();
		c.methodC1();
		c.methodC2();
		c.same();
		b.same();
		System.out.println(c.var3);
	}
	
	
}
