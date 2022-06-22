package JavaBasics;



public class damaru {

	
	public void d1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}	
			for(int k=5;k>i;k--) {
				System.out.print("  ");
				
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
	}
	public void d2() {
		for(int i=2;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for(int l=5;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
	
			
		}
		
	}
	public static void main(String[] args) {
		damaru obj=new damaru();
		obj.d1();
		obj.d2();
	}
}
