package operators;

public class Ass34 {
// program for equal operator and not equal operator
	public static void main(String[] args) {
		
	
	int op1=55;
	int op2=45;
	
	boolean result;
	
	result=op1==op2;
	System.out.println("The op1 and op2 relation is "+result);
	
	result=op1!=op2;
	System.out.println("the op1 and op2 relation is "+result);
	//equal or not
	if(op1==op2) {
		System.out.println("the 2 numbers r equals");
	}
	else {
		System.out.println("the 2 numbers r not equals");
	}
	
}
}
