package org.foobarspam.bowling.test;

import static org.junit.Assert.*;
import org.foobarspam.bowling.game.ScoreCard;

import org.junit.Test;

public class CardTest {

	
	private void calculateScore(ScoreCard scoreCard){
		
		for(int i=0; i < scoreCard.getScoreCard().length(); i++){
			char pin = scoreCard.getScoreCard().charAt(i);
			scoreCard.roll(pin);
		}		
	}

	@Test
	public void TotalScoreHittingPins(){
		
		// Hitting pins total = 60
		String pins = "12345123451234512345";
		int total = 60;
		
		ScoreCard scoreCard = new ScoreCard(pins);
		
		calculateScore(scoreCard);
		
		assertEquals(total, scoreCard.getTotalScore());			
	}
}
