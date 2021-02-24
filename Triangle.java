import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		
		
		//initialize the scanner object
		Scanner input = new Scanner(System.in);
		
		
		//declare the variables for triangle sides to be read in
		int a;
		int b;
		int c;
		
		//prompt the user to enter 3 sides
		System.out.print("Enter triangle side #1: ");
		a = input.nextInt();
		
		while(a == 0)
		{
			System.out.print("Enter a nonzero value for triangle side #1: ");
			a = input.nextInt();
		}
		
		
		//side 2
		System.out.print("\nEnter triangle side #2: ");
		b = input.nextInt();
		
		while(b == 0)
		{
			System.out.print("Enter a nonzero value for triangle side #2: ");
			b = input.nextInt();
		}
		
		
		//side 3
		System.out.print("\nEnter triangle side #3: ");
		c = input.nextInt();
		
		while(c == 0)
		{
			System.out.print("Enter a nonzero value for triangle side #3: ");
			c = input.nextInt();
		}
		
		
		if(a + b > c && b + c > a && a + c > b)
		{
			System.out.println("\nThe sides will display a valid triangle.");
		}
		else
		{
			System.out.println("\nThe sides will NOT display a valid triangle.");
		}
		
		
		
		
	}

}
