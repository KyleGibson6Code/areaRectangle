package rectangleAREA1;
import java.util.Scanner;
public class area1 {

	
		

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.println("Enter the length of the rectangle");
			
		double length = input.nextDouble();
		
		
		
		System.out.println("Enter the width of the rectangle");
		
		 double width = input.nextDouble();
		 
		 
		 
		
		 
		 
		 //How to find area
		 
		 System.out.println("Area is:" +(length*width));
		
		//create switch
		 
		 String Find = "Yes";
		 	
		 	
				 
		 
 
	 System.out.println("Would you like to find the area of another rectangle?");
		String Find1 =input.next();
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 switch(Find1) {
		case "yes":

			Scanner input1 = new Scanner(System.in);

			System.out.println("Enter the length of the rectangle");
				
	
			double length1 = input.nextDouble();
		
		
		
		System.out.println("Enter the width of the rectangle");
		
		 double width1 = input.nextDouble();
		 
		 
		 input.close();
		
		 
		 
		 //How to find area
		 
		 System.out.println("Area is:" +(length*width));
		
			
		default: 
			System.out.println("Thank you for creating Areas with our program!");
			
		
	
		 
		 
		 
		 
		 
		 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	

		
	}
}

