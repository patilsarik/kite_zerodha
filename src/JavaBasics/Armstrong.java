package JavaBasics;

public class Armstrong 
{
	public static void main(String[] args)
	{
		int n=370;
		int rem;
	
		int arm=0;
		int  temp=n;
		int count=0;
		while(temp!=0) {
			
			count=count+1;
			temp=temp/10;
		}
		//System.out.println(count);
		int temp2=n;
	    while(temp2!=0) {
	    	rem=temp2%10;
	    	int mul=1;
	    	for(int i=1;i<=count;i++) {
	    		mul=mul*rem;
	    		
	    	}
	    	arm=arm+mul;
	    	temp2=temp2/10;
	    }
	    if(arm==n) {
	       System.out.println("the num is arm "+n);
	    }
	    else {
	    	System.out.println("not armstrong "+n);
	    }
	}
	}
	
	
	
	

