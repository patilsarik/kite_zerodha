package String;

public class WholeASS {
 public static void main(String[] args) {
	//1. Different ways creating a string

	      //there are two ways to create a string
	      //first ways is:-by literal way
	 String s="welcome to jala academy ";
	    //by using a new keyword
	 String a=new String("hello this is jala assignment ");
	 
	 //2. Concatenating two strings using + operator
     String c= s.concat(a);
     System.out.println(c);
     
     //3. Finding the length of the string
     int length=s.length();
     System.out.println(length+" is the length of string s");
     int length1=a.length();
     System.out.println(length1+" is the length of string a");
     
    //4. Extract a string using Substring
     String substring=a.substring(2,8);
     System.out.println(substring+" this is substring");
     
     //5. Searching in strings using indexOf()
     System.out.println(s.indexOf("welcome"));
     
     //6. Matching a String Against a Regular Expression With matches()
     System.out.println(a.matches("jala(.*)"));

     //7. Comparing strings using the methods equals(), 
     System.out.println(a.equals(s));
     
     //8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
     System.out.println(a.equalsIgnoreCase(s));
     System.out.println(a.startsWith("hello"));
     System.out.println(a.endsWith("assignment"));
     System.out.println(a.compareTo(s));
     System.out.println(a.compareToIgnoreCase(s));
     
     //9. Trimming strings with trim()
      System.out.println(s.trim());  
      
      //10. Replacing characters in strings with replace()
      System.out.println(a.replace('e','i'));
      
      //11. Splitting strings with split()
     System.out.println(a.substring(4));
     
     //12. Converting Numbers to Strings with valueOf()
      int i=100;
      String str=String.valueOf(i);
      System.out.println(str+100);
      
      //13. Converting integer objects to Strings
      int j=300;
      String st=String.valueOf(j);
      System.out.println(st+100);
      
      //14. Converting to uppercase and lowercase
      String upper="TODAY IS MONDAY";
      System.out.println(upper.toLowerCase());
      String lower="tommarow is tuesday";
      System.out.println(lower.toUpperCase());
      
      
      
      

      
     
     
     

     
   
}	
}
