import java.util.*;
/* AUTHOR: uno
 Program number 1/365
 20/May/2018
 
 			      				 Guesser
				Guess a random number ranging from 1 to 5, win if you guess correct.
*/

class guesser {
	public static void main (String[] p) { //our main 
		System.out.println("What is your name?"); 
		String name = getString();
		System.out.println("Hello " + name + ".");
		game(); // Our game so we can call the method to play again
	}

	public static String getString(){  //get user input as String
    	
		Scanner scanner = new Scanner(System.in);  
		return scanner.nextLine();  
   	}
	public static int getInt(){  //get user input as Integer
    	
		Scanner scanner = new Scanner(System.in);  
		return scanner.nextInt();  
   	}

	public static void game(){

		Random rand = new Random();  
        int  correctnumber = rand.nextInt(5) + 1;

		System.out.println("Guess a number! from 1 to 5");
		int playerguess = getInt();    

		if(playerguess == correctnumber){
			System.out.println("Correct! You win the game!");
			System.out.println("Play again? Yes/No");
			String answer = getString();
			if(answer.equals("Yes")) {
				game();
			}
			else{
				System.out.println("Until next time.");
				System.exit(0);
			}
		}
		else{
			System.out.println("Wrong guess! Play again? Yes/No");
			String answer = getString();
			if(answer.equals("Yes")) {
				game();
			}
			else{
				System.out.println("Thank you for your time.");
				System.exit(0);
			}
		}
	}


}


