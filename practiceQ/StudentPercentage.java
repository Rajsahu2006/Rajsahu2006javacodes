package practiceQ;
 import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declare variables
        int marks1, marks2, marks3, marks4, marks5;
        double total, percentage;
        
        // Take input for 5 subjects
        System.out.println("Enter marks for 5 subjects (out of 100 each):");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        marks4 = sc.nextInt();
        marks5 = sc.nextInt();
        
        // Calculate total and percentage
        total = marks1 + marks2 + marks3 + marks4 + marks5;
        percentage = (total / 500) * 100;
        
        // Display result
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        
        // Optional: Grade calculation
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}       



    
    

