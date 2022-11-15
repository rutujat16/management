package swapping;

import java.util.Scanner;

public class swap2no {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);  // read input from the input stream
	       //Define variable//
	        System.out.println("Enter the value of X:");
	        int x = sc.nextInt();   //(let x=10)(01010)
	       
	        System.out.println("Enter the value of y:");
	        int y = sc.nextInt();   //(let y=20) (10100)
	      
	        System.out.println("before swapping x = "+x );
		    System.out.println("before swapping y = "+ y);  
		      
	       //Swapping//
		    //
	        x = x^y;  // 01010 xor 10100  =11110 //
	        y = x^y;   //11110 xor 10100  = 01010//
	        x = x^y;   // 11110 xor 01010  = 10100//
	      
	        System.out.println("\n **************************");
		   
	        System.out.println("\n After swapping x = "+x);
		    System.out.println("After swapping y = "+ y);  

	}

}
