//Aim of the program: Write a program to print the corresponding grade
// for the given mark using if else statement in Java Input:
// Mention the grade in the program Output: Display the Grade either O/E/A/B/C
import java.util.Scanner;
public class GradeCheck
{
    public static void main(String[] args)
    {
        int marks = 85;   // Input: Mention the mark here
        char grade;
        if (marks >= 90)
            grade = 'O';
        else if (marks >= 80)
            grade = 'E';
        else if (marks >= 70)
            grade = 'A';
        else if (marks >= 60)
            grade = 'B';
        else if (marks >= 50)
            grade = 'C';
        else
            grade = 'F';   // Fail
        System.out.println("Grade: " + grade);
    }
}