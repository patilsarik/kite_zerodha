package operators;

public class Ass12 {
    
	public void opera() {
		  int num1=20;
		  int num2=40;
		  System.out.println(num1+num2);
		  System.out.println(num1-num2);
		  System.out.println(num1*num2);
		  System.out.println(num2/num1);	 	 
	}
	public static void main(String[] args) {
		Ass12 ref=new Ass12();
		ref.opera();
		
		 int increment=2;
		 System.out.println(++increment);//pri increment operator++
		 System.out.println(increment++);//post increment operator++
		 
		 int decrement =5;
		 System.out.println(--decrement);//pri decrement operator--
		 System.out.println(decrement--);//post decrement operator--
	}
	
	
}
