package JavaBasics;

public class Ass1 {//class created.
   
	public void Test() {//method created
		System.out.println("I am method of Ass1 class");
	}
	
	public static void main(String[] args) {//main method
		Ass1 object=new Ass1();//object created
		object.Test();//called the non static method
	}
	
}
