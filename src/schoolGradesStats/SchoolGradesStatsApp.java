package schoolGradesStats;

import java.util.*;

import javax.swing.JOptionPane;

public class SchoolGradesStatsApp {

	static Scanner input = new Scanner(System.in);
	final static String[] subjects = {"Mathematics","Spanish","English","History","Physics"};
	final int[] points = new int[subjects.length];
	final static PriorityQueue<Character> grades = new PriorityQueue<Character>();

	public static void main(String[] args) {

		int[] pointArray = new int[subjects.length];
		LäsPoäng(pointArray);

	}

	static void LäsPoäng (int[] pointArray) {
		pointArray = new int[subjects.length];
		String result = "";
		for (int i = 0; i < pointArray.length; i++) {

			String pointString = JOptionPane.showInputDialog("Type the points earned in " + subjects[i] + ":");

			pointArray[i] = Integer.parseInt(pointString);

		}

		for(int j = 0; j < subjects.length; j++) {

			if (pointArray[j] <= 100 && pointArray[j] >= 81)
				grades.offer('A');
			else if (pointArray[j] <= 80 && pointArray[j] >= 61)
				grades.offer('B');
			else if (pointArray[j] <= 60 && pointArray[j] >= 41)
				grades.offer('C');
			else if (pointArray[j] <= 40 && pointArray[j] >= 21)
				grades.offer('D');
			else
				grades.offer('F');

			// Show the results
			result += "The points for " + subjects[j] + " are " + pointArray[j] + " and the grade is " + grades.poll() + "\n";

		}

		JOptionPane.showMessageDialog(null, result);

	}
}


