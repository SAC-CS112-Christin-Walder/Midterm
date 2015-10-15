import java.util.Scanner;

public class BasicGame
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		String oddeven = "";
		
		System.out.println("You are about to roll a six-sided dice...");
		System.out.print("Will the number be odd or even? ");
		String guess = input.next();
		guess = guess.toUpperCase();

		int dice = 1 + (int)(Math.random() * 6);

		if (dice==1 || dice==3 || dice==5)
			oddeven = "ODD";
		if (dice==2 || dice==4 || dice==6)
			oddeven = "EVEN";
		
		System.out.printf("You rolled %d, an %s number.\n", dice, oddeven);
		
		System.out.printf("You guessed the number would be %s.\n", guess);
		
		if (guess.equals(oddeven))
			System.out.print("You were right!");
		else
			System.out.print("You were wrong...");
	
		}	
		
}