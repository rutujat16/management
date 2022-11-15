package swapping;
import java.util.Scanner;
public class swapping {

	public static void main(String[] args) {
		
		 int x, y, t;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  // read input from the input stream
	       System.out.println("Enter the value of X");
	        x = sc.nextInt(); //(let x=10)
	      
	       System.out.println("Enter the value of y");
	        y = sc.nextInt();  //(let y=15)
	       
	       System.out.println("before swapping x = "+x );
	       System.out.println("before swapping y = "+ y);  
	      
	       /*swapping */ 
	       t = x;  // t = 10  x=
	       x = y;  // x = 15  y=
	       y = t;  // y =15
	       System.out.println("\n **************************");
	       System.out.println("\n After swapping x = "+x);
	       System.out.println("After swapping y = "+ y);
	      // System.out.println( ); 
	}

}













