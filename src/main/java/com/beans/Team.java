package com.beans;

public class Team {
	
	String name;
	int score;
	int turn;
	boolean isWinner;
	boolean isTurn;
	
	
	
	public Team(String name) {
		super();
		this.name = name;
		this.score = 0;
		this.turn = 0;
		this.isWinner = false;
		this.isTurn = false;
	}
	
	
	
	public Team(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}



	public int getTurn() {
		return turn;
	}



	public void setTurn(int turn) {
		this.turn = turn;
	}



	public boolean getIsWinner() {
		return isWinner;
	}



	public void setIsWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}



	public boolean getIsTurn() {
		return isTurn;
	}



	public void setIsTurn(boolean isTurn) {
		this.isTurn = isTurn;
	}
	
	

}
