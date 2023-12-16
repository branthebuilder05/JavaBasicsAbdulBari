import java.util.*;
public class exception
{
	public static void main(String[] args) {
	    int a[]={4,0},b,c,d;
	    try{
	    a[0]=5;
	    b=0;
	   // c=a[1]/a[6];
	    d=a[0]/1;
	   // System.out.println(d+" "+d);
	   System.out.println();
	    }
	   //  catch(ArithmeticException e){
	   //     System.out.println("illegal expresion "+e.toString());
	        
	   // }
	     catch(Exception e){
	        System.out.println("illegal expresion "+e.getMessage());
	       // e.printStackTrace();
	        
	        
	    }
	    finally{
	        System.out.println("hey!! Program has ended");
	    }
	   
	   
	    
	}
}
