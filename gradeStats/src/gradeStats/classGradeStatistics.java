package gradeStats;

import java.util.Arrays;
import java.util.Scanner;

public class classGradeStatistics {
	
	public static void main(String[] args) {
		
		final float gradeMinimum;
		final float gradeMaximum;
		final float gradeAverage;
		
		// Enter Number Of Grades
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Please put how many grades you want to enter: ");
		int gradeAmount = scanner.nextInt();
		
		// Store Grades in Array
		float[] grades = new float[gradeAmount];

		// Create for Loop + Enter Grades In Array
		for (int i = 0; i < gradeAmount; i++) {
			System.out.print ("Please enter a grade: ");
			grades[i] = scanner.nextFloat();
		}
		
		// Find Minimum Grade
		Arrays.sort(grades);
		gradeMinimum = grades[0];
		System.out.println("The minimum grade is: " + gradeMinimum);
		
		// Find Maximum Grade
		Arrays.sort(grades);
		gradeMaximum = grades[grades.length - 1];
		System.out.println ("The maximum grade is: " + gradeMaximum);
		
		// Find Grade Average
		int length = grades.length;
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		
		gradeAverage = sum / length;
		System.out.println("The average grade is: " + gradeAverage);
				
	}

}
