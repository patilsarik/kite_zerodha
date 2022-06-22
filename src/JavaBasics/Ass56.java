package JavaBasics;

public class Ass56 {
    //global variable is accessed anywhere any class and in other class.
	
	int a=20;//global non static variable
	static int b=10;//non static global variable
	String s="I am global string";
	
	
	public void demo() {
		System.out.println(a+b);//static variable can directly call in non static method
	}
	
	public static void demo2() {
		Ass56 obj=new Ass56();
		System.out.println(obj.a);//non static variable cannot directly call in non static method
		
	}
	//writing a function and calling my name from main method
	
	public void name() {
		System.out.println("hello this is sarika");
	}
	
	public static void main(String[] args) {
		System.out.println(b);
		Ass56.demo2();
		Ass56 obj=new Ass56();
         obj.demo();
         Ass56.demo2();
         obj.name();  
         
	}
}
