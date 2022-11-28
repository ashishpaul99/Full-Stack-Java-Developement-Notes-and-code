import java.util.Scanner;
//1. Activity of guesser
class Guesser {
	//has part
	int guessNum;
	
	//do part
	int guessNum(){
	//asking guesser to guess number
		System.out.println("Guesser guess a number:");
		Scanner scan=new Scanner(System.in);
	//storing guessed number in variable
		guessNum=scan.nextInt();
		return guessNum;
	}
}
//2. Activity of Player
class Player{
	//has part
	int guessNum;
	//do part
	int guessNum(){
		//asking player to guess number and store in varibale
		System.out.println("Player guess a number:");
		Scanner p=new Scanner(System.in);
		guessNum=p.nextInt();
		return guessNum;
	}
}

//3. Activity of Umpire
class Umpire{
	//has part
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	//do part
	void collectNumFromGuesser(){
//		invoke values from guesser class by creating object
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	 }
	
//	invoke values from Player class
	void collectNumFromPlayers() {
		Player p1=new Player();
		numFromPlayer1=p1.guessNum();
		
		Player p2=new Player();
		numFromPlayer2=p2.guessNum();
		
		Player p3=new Player();
		numFromPlayer3=p3.guessNum();
	  }
	
//Umpire compares Guesser vlaue with Players value
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("All player won the match");
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Player 1 and 2 won the match");
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 1 and Player 3 won match");
			}
			else {
			System.out.println("Player 1 Won the match");
			}
		}
		else if(numFromGuesser==numFromPlayer2) {
			
			if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player 2 and Player 3 won the match");
			}
			else {
			System.out.println("Player 2 Won the match");
			}
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("Player 3 Won the match");
		}
		else {
			System.out.println("game lost try again");
		}
	}
	
	
}
public class guesserproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Umpire u=new Umpire();
   //calling methods by umpire
   u.collectNumFromGuesser();
   u.collectNumFromPlayers();
   u.compare();
   
	}

}
