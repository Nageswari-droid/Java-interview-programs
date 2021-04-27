package com;

import printer.Output;
import random.Randomization;

public class Game {
	private int ballCount = 1;
	private Randomization random;
	private Output output;
	
	public void startGame(Player battingPlayer, Player bowlingPlayer, int flag) {
		
		int battingRun;
		int bowlingRun;
		
		while(ballCount <= 6) {
			battingRun = random.generateRandomRun();
			bowlingRun = random.generateRandomRun();
			
			String battingMessage = battingPlayer.getPlayerName() + " throws " + battingRun + " , ";
			String bowlingMessage = bowlingPlayer.getPlayerName() + " throws " + bowlingRun ;
			
			output.consolePrintSingleLine(battingMessage + bowlingMessage);
			
			if(battingRun == bowlingRun) {
				String gameOverMessage = "\n"+ battingPlayer.getPlayerName() + " lost. Total score is " + battingPlayer.getPlayerTotalScore() ;
				output.consolePrintNewLine(gameOverMessage); 
				break;
			}
			
			battingPlayer.addScore(battingRun);
			output.consolePrintSingleLine(" , " + battingPlayer.getPlayerName() + " score is " + battingPlayer.getPlayerTotalScore() + "\n");
			
			if(flag != 0) {
				if(bowlingPlayer.getPlayerTotalScore() < battingPlayer.getPlayerTotalScore()) {
					break;
				}
			}
			
			ballCount++;
		}
	}
	
	public Player gameWinner(Player playerOne, Player playerTwo) {
		
		int playerOneScore = playerOne.getPlayerTotalScore();
		int playerTwoScore = playerTwo.getPlayerTotalScore();
		
		if(playerOneScore == playerTwoScore) {
			return null;
		}
		else if(playerOneScore > playerTwoScore) {
			return playerOne;
		}
		else {
			return playerTwo;
		}
	}
}
