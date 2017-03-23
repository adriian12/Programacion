package org.foobarspam.bowling.game;

public class ScoreCard {
	
	private String scoreCard = "";
	private int totalScore = 0;
	public static String symbols = "-123456789X/";
	
	/* Constructores */
	
	public ScoreCard(){
		this.scoreCard = "";
	}
	public ScoreCard(String ScoreCard){
		this.scoreCard = scoreCard;
	}
	
	/* Getters y setters */
	
	public String getScoreCard() {
		return scoreCard;
	}
	
	public int getTotalScore(){
		return this.totalScore;
	}
	
	public void setScoreCard(String scoreCard) {
		this.scoreCard = scoreCard;
	}
	
	public void roll(char pin){
		total = getTotalScore() + getSimbolValue(pin);
		
	}
	
	
		
	

}
