//Aim of the program:   Write a program to print the week day for the given day no. of the current month using switch case statement
//Input:  Mention the Day no in the program
//Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday /Thursday/Friday/Saturday)
import java.util.*;
public class WeekDay
{
    public static void main(String[] args)
    {
        int dayNo = 3;   // Input: Mention the day number (1 to 7)
        switch (dayNo)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number! Enter 1–7.");
        }
    }
}