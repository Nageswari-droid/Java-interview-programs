package com;

public class Player {
	private String playerName;
	private int playerTotalScore;
	
	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}
	
	public void addScore(int runs) {
		this.playerTotalScore = this.playerTotalScore + runs;
	}
	
	public int getPlayerTotalScore() {
		return playerTotalScore;
	}
}
