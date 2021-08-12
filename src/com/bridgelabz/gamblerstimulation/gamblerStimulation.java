package com.bridgelabz.gamblerstimulation;

import java.util.Arrays;

public class gamblerStimulation {
	
	public static int stake_per_day = 100, betPerGame = 1;
	public static void main(String[] args) {
		int i,won_amt=0,loss_amt=0,countWin=0,countLoss=0,max,min;
		int arr[] = new int[20];
		for(i=0;i<=19;i++) {
			while(stake_per_day > 50 && stake_per_day < 150) {
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
			System.out.println("You are resign for the day " + (i + 1));
			if(stake_per_day < 100) {
				loss_amt = loss_amt + (100 - stake_per_day); 
				countLoss++;
				arr[i] = loss_amt;
			}
			else {
				won_amt = won_amt + (stake_per_day + 100);
				countWin++;
				arr[i] = won_amt;
			}
		}
		max = Arrays.stream(arr).max().getAsInt();
		min = Arrays.stream(arr).min().getAsInt();
		System.out.println("The winning amount is :- " + won_amt);
		System.out.println("The loss amount is :- " + loss_amt);
		System.out.println("The winning days is :- " + countWin);
		System.out.println("The loss days is :- " + countLoss);
		for(i=0;i<=19;i++) {
			if(arr[i] == max) {
				System.out.println("The luckiest day is " + i);
			}
			else if(arr[i] == min) {
				System.out.println("The unluckiest day is " + i);
			}
		}
		
	}

}
