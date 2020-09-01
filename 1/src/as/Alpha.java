package as;

class Base { 
	int a;
     Base() { 
    	 a=1;
    	 System.out.println("Base"); } 
 } 
 public class Alpha extends Base { 
     public static void main( String[] args ) { 
           new Alpha(); 
           new Base(); 
     } 
 } 
