package assignments3;

import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number:");
		guessNum=scan.nextInt();
		if(guessNum>=1 && guessNum<=10)
		{
			return guessNum;
		}else {
			return -1;
		}
			
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		if(guessNum>=1 && guessNum<=10)
		{
			return guessNum;
		}else {
				return -1;
			}
	}
}

class Umpire
{
	int numFromGuesser;
	int[] numFromPlayer;
	int noOfPlayers;
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
		if(numFromGuesser==-1) {
			System.out.println("Error!Please enter number between (1-10)");
			numFromGuesser=g.guessNum();
		}
	}
	void collectNumFromPlayers(int noOfPlayers)
	{
		this.noOfPlayers=noOfPlayers;
		numFromPlayer=new int[noOfPlayers];
		
		for(int i=0;i<noOfPlayers;i++) 
		{
			System.out.println("Player "+(i+1)+":");
			Player p=new Player();
			numFromPlayer[i]=p.guessNum();
			if(numFromPlayer[i]==-1) {
				System.out.println("Error!Please enter number between (1-10)");
				numFromPlayer[i]=p.guessNum();
			}
		}
		
		
	}
	void compare()
	{
		boolean flag=false;
		int count=0;
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<this.noOfPlayers;i++) {
			
			if(numFromPlayer[i]==numFromGuesser) {
				sb.append("Players "+(i+1)+"\n");
				flag=true;
				count++;
			}
		}
		
		if(flag==true) 
		{
			System.out.println("Players won:");
			System.out.println(sb);
			if(count==this.noOfPlayers)
			{
				System.out.println("All Playes won the game.");
			}
		}else {
			System.out.println("Oops! No Players won.");
		}
		
		
		
		
	}
}


public class Question1 {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			System.out.println("How many Players want to play?");
			Scanner sc=new Scanner(System.in);
			int noOfPlayers=sc.nextInt();
			System.out.println(noOfPlayers+ " is playing this game it will be more fun \nLets Play");
			System.out.println("Lets understand rule ");
			System.out.println("======================");
			System.out.println("1.Number should be use between 1 to 10 ");
			System.out.println("2. No Other than (1-10) is allowed");
			
			//calling guesser
			System.out.println("===========================");
			System.out.println("Guesser Turn Now.");
			u.collectNumFromGuesser();
			
			//calling players 
			System.out.println("===========================");
			u.collectNumFromPlayers(noOfPlayers);
			
			System.out.println("=========Result=============");
			u.compare();
			System.out.println("============================");

	}

}
