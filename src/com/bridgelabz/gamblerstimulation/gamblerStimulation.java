package com.bridgelabz.gamblerstimulation;

public class gamblerStimulation {
	
	public static int stake_per_day = 100, betPerGame = 1;
	public static void main(String[] args) {
		
		double betResult = Math.floor(Math.random() * 10) % 2;
		if(betResult == 1.0) {
			System.out.println("Congratulation !! you have won the bet");
		}
		else {
			System.out.println("You have lost the best, Better luck next time");
		}
		
	}

}
