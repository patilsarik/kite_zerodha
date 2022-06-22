package operators;

public class Ass56 {
    public static void main(String[] args) {
		int siya =7;
		int maya=4;
		boolean result;
		// Programs on Logical AND,OR operator and Logical NOT

		result=(siya>maya)&& (maya<siya);
		System.out.println(result);
		
		result=(maya<siya)||(siya!=maya);
		System.out.println(result);
		
		result=maya!=siya;
		System.out.println(result);
    	
		// Program for relational operators (<,<==, >, >==)
		
		result=siya>=maya;
		System.out.println(result);
		result=siya<=maya;
		System.out.println(result);
		result=siya==maya;
		System.out.println(result);
		result=siya!=maya;
		System.out.println(result);

	}
}
