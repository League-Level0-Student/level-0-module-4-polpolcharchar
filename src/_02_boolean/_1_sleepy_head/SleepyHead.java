package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		String day = JOptionPane.showInputDialog("What day is it?");
        if(day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")){
        	 isWeekend = true;
        }
        else {
        	isWeekend = false;
        }
		// Set the boolean isWeekend based on the value they enter
        
		
		
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend) {
			JOptionPane.showMessageDialog(null, "You get to sleep in!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get your head out of bed and go to school!");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
int score = Integer.parseInt(JOptionPane.showInputDialog("What is your test score?"));
		
		// If they scored more than 70, they passed the exam.
if(score>70) {
	passedExam=true;
	JOptionPane.showMessageDialog(null, "Great job!");
}
else {
	passedExam=false;
	JOptionPane.showMessageDialog(null, "Better luck next time!");
}
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "Game is over!");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		if(JOptionPane.showInputDialog("Is the shape red?").equalsIgnoreCase("yes")) {
			isRed=true;
		}
		else {
			isRed=false;
		}
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		if(JOptionPane.showInputDialog("What shape should be drawn?").equalsIgnoreCase("square")) {
			isSquare=true;
		}
		else {
			isSquare=false;
		}
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		drawRedSquare(isRed, isSquare);

	}

	
	static void drawRedSquare(boolean isRed, boolean isSquare) {
		Robot rob = new Robot();
		// Complete the rest of this method
		if(isRed && isSquare) {
			rob.penDown();
			rob.setSpeed(100);
			rob.setPenColor(Color.RED);
			for(int i = 0;i<4;i++) {
				rob.move(50);
				rob.turn(90);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "I don't know how to draw that!");
		}
		
		
		
		
		
		
		
	}	
}
