import java.util.Scanner;

public class coinbros {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String headsOrTailsGuess;
		double numberOfFlips;
		double correctCount = 0;
		int heads = 0;
		int tails = 0;
		float percentage = 0;
		
		System.out.println("Guess which will come up more, heads or tails. ");
		headsOrTailsGuess = scan.nextLine();
		System.out.println("How many times should we flip this beast? ");
		numberOfFlips = scan.nextInt();
		System.out.println("Who will be victorious? My heart is racing!");
		
		for (int flips = 0 ; flips < numberOfFlips ; flips ++) {
			double face = Math.random();
			if (face <= (.499999)){
				heads ++;
				System.out.println("Heads!");
			}
					else if (face >= (.5)) {
						tails ++;
						System.out.println("Tails!");
					}			
		}
		
		if (headsOrTailsGuess.contentEquals("heads")) {
			correctCount = heads;
		}
			else if (headsOrTailsGuess.contentEquals("tails")) {
				correctCount = tails;
			 
			}
		
		percentage = (float) ((correctCount*100)/numberOfFlips);
		 
		System.out.println("Your choice of " + headsOrTailsGuess + " came up " + correctCount + " times!");
		System.out.println("Thats " + percentage + " percent!");
		
		if (percentage > 50) {
			System.out.println("Nice guess, bro!");
		}
			else if (percentage == 50) {
				System.out.println("What are the odds!");
			}
				else if (percentage < 50) {
					System.out.println("Total bummer dude.");
				}
		
		scan.close();
	}
	
} 


