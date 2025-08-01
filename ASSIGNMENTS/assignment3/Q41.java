// Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
// 	Percentage >= 90% : Grade A 
// 	Percentage >= 80% : Grade B 
// 	Percentage >= 70% : Grade C 
// 	Percentage >= 60% : Grade D 
// 	Percentage >= 40% : Grade E 
// 	Percentage < 40% : Grade F

import java.util.Scanner;

class Test{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 5 subjects
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Biology: ");
        int biology = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        int computer = sc.nextInt();

        // Calculate total and percentage
        int total = physics + chemistry + biology + math + computer;
        double percentage = (total / 5.0);

        // Print percentage
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Determine grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);

        sc.close();
    }
}