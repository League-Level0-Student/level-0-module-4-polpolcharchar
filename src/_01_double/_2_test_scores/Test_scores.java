package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_scores {
public static void main(String[] args) {
	
	
	double score = Double.parseDouble(JOptionPane.showInputDialog("What is your test score?"));
	if(score > 90) {
		JOptionPane.showMessageDialog(null, "Wow, you really studied!");
	}
	else if(score>80) {
		JOptionPane.showMessageDialog(null, "Nice Job");
	}
	else if(score>70) {
		JOptionPane.showMessageDialog(null, "You could've done better!");
	}
	else {
		JOptionPane.showMessageDialog(null, "C'mon Man! You need to study more!");
	}
	
	
	
	
	
	
	
}
}
