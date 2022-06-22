package Static;

public class Ass1 {

	//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
	//methods and a main method.
	
	static int a=10;
	static double b=20.3;
	
	int instance=20;
	int instance1=33;
	
	public static void test() {
		System.out.println("i am static first method");
		
		//2. Print instance variables in static methods
        Ass1 obj=new Ass1();
        System.out.println(obj.instance);
        System.out.println(obj.instance1);
	}
	
	public static void test2() {
		System.out.println("i am static second method");
		//4. Call instance methods in static methods
		Ass1 a=new Ass1();
		a.demo1();	
	}
	public void demo1() {
		System.out.println("i am instance method od demo1");
		
		//3. Print static variables in Instance methods
       System.out.println(a);
       System.out.println(b);
		
	}
	public void demo2() {
		System.out.println("i am instance method of demo 2");
		//5. Call static methods in instance methods
		Ass1.test();		

	}
	public static void main(String[] args) {
		//6. Print all the static, instance variables in main method
        System.out.println(Ass1.a);
        System.out.println(Ass1.b);
        Ass1 object=new Ass1();
        System.out.println(object.instance);
        System.out.println(object.instance1);
        
        //7. Call static methods and instance methods in main method
        Ass1.test();
        Ass1.test2();
        
        object.demo1();
        object.demo2();	
		
	}
	
}
