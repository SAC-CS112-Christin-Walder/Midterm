import java.util.Scanner;

public class Tracking4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		String oddeven = "";
		String repeat = "";
		double count = 1;
		double odd = 0;
		double wins = 0;
		double oddpercentage = 0;
		double percentage = 0;

	do {
	
		System.out.println("You are about to roll a six-sided dice...");
		System.out.print("Will the number be odd or even? ");
		String guess = input.next();
		guess = guess.toUpperCase();
	
		int dice = 1 + (int)(Math.random() * 6);

		if (dice==1 || dice==3 || dice==5)
			odd = odd + 1;
			oddeven = "ODD";
		if (dice==2 || dice==4 || dice==6)
			oddeven = "EVEN";
		
		System.out.printf("You rolled %d, an %s number.\n", dice, oddeven);
		
		System.out.printf("You guessed the number would be %s.\n", guess);
		
		if (guess.equals(oddeven)) {
			wins = wins + 1;
			System.out.print("You were right!\n"); }
		else
			System.out.print("You were wrong...\n");
		
		//System.out.printf("Times you have played: %.0f\n", count);	
		
		oddpercentage = ((odd/count)*100);
		
		System.out.printf("Odd numbers rolled: %.2f percent\n", oddpercentage);
		
		//System.out.printf("Times you have won: %.0f\n", wins);
			
		//percentage = ((wins/count)*100);

		//System.out.printf("Wins percentage: %.2f percent\n\n", percentage);
		
		System.out.printf("Do you want to play again? (yes or no): ");
		repeat=input.next();
		repeat = repeat.toUpperCase();
		
		count++;
	}
	
	while (repeat.equals("YES")); 
		if (repeat != ("YES"))
			System.out.print("Thanks for playing!");	
	}
}