package com.bridgelabz.gamblerstimulation;

public class gamblerStimulation {
	
	public static int stake_per_day = 100, betPerGame = 1;
	public static void main(String[] args) {
		while(50 < stake_per_day && stake_per_day < 150) {
			double betResult = Math.floor(Math.random() * 10) % 2;
			if(betResult == 1.0) {
				System.out.println("Congratulation !! you have won the bet");
				stake_per_day++;
			}
			else {
				System.out.println("You have lost the best, Better luck next time");
				stake_per_day--;
			}
			
		}
		System.out.println("Your today's betting collection is :- " + stake_per_day);
		System.out.println("You are resign for the day");
		
	}

}
