package seleniumPrograms;

import java.util.Scanner;

public class TakingInputKeyboard {
	
	
	public static void main(String[] args) {
int x, y, z;
System.out.println("Enter 2 Intigers to calculate their SUM");
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();

z = x + y;

System.out.print("Sum of entered integers = "+z );


		
		
	}

}
