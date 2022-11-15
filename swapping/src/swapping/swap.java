package swapping;
import java.util.Scanner;
public class swap {

	public static void main(String[] args) 
	{
		
		
        Scanner sc = new Scanner(System.in);  // read input from the input stream
       //Define variable//
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();  
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();  
        System.out.println("before swapping x = "+x );
	    System.out.println("before swapping y = "+ y);  
	      
       //Swapping//  
        x = x + y;   
        y = x - y;   
        x = x - y;   
      
        System.out.println("\n **************************");
	   
        System.out.println("\n After swapping x = "+x);
	    System.out.println(" After swapping y = "+ y);   
	}

}
