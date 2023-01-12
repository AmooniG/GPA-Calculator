import java.text.DecimalFormat;
import java.util.Scanner;

public class gpaCalculator {
  


	public static void main(String[] args) {
		
		
	    Scanner scanner = new Scanner(System.in);
	    
	    Integer totalPoints = 0;
	    Integer totalCredits = 0;
	    
	    boolean moreClasses = false;
	    
	    do {
		    
		    Integer credits = 0;
		    boolean validCredits = true;
			//do statement to keep looping until valid credits are inputed
		    do {
		    	validCredits = true;
		    	
			    System.out.println("Enter number of credits:");
			    String creditsString = scanner.nextLine();  
			    
			    try {
			    	credits = Integer.parseInt(creditsString);
			    }//try
			    catch (NumberFormatException nfe){
				    System.out.println("Please enter a valid integer");
				    validCredits = false;
			    }//catch
		    }//do
		    while (!validCredits);
		    
		    
		    
		    boolean validGrade = true;
	
		    Integer gradeValue = 0;
		    String grade = "";
			//do statement to keep looping until a valid grade is inputed
		    do {
		    	validGrade = true;
		    	
			    System.out.println("Enter the letter grade:");
			    grade = scanner.nextLine();  
			    
			    if (grade.equalsIgnoreCase("A")) {
			    	gradeValue = 4;
			    } else if (grade.equalsIgnoreCase("B")) {
			    	gradeValue = 3;
			    } else if (grade.equalsIgnoreCase("C")) {
			    	gradeValue = 2;
			    } else if (grade.equalsIgnoreCase("D")) {
			    	gradeValue = 1;
			    } else if (grade.equalsIgnoreCase("F")) {
			    	gradeValue = 0;
			    } else {
				    System.out.println("You didn't enter a valid grade :(");
				    validGrade = false;
			    }//else
		    }//do
		    while (!validGrade);
		    
		    
		    Integer points = gradeValue * credits;
		    
		    totalPoints += points;
		    totalCredits += credits;
		    
		    System.out.println("Would you like to enter another class? (Y/N)");
		    String moreClassesString = scanner.nextLine();  
		    
		    moreClasses = moreClassesString.equalsIgnoreCase("Y");
		    
	    }//do
	    while (moreClasses);
	    
	    
	    DecimalFormat df = new DecimalFormat("0.00");

	    Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);
	    
	    
	    System.out.println("Credits: " + totalCredits);  
	    System.out.println("Points: " + totalPoints);  
	    System.out.println("GPA: " + df.format(gpa));  
	    
	    
	    scanner.close();
	}//main


}//class