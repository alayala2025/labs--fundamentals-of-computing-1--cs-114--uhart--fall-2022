import java.util.Scanner;
// File:     Errors.java
// Purpose: A program with lots of syntax errors
// Correct all of the errors (STUDY the program carefully!!)
public class Errors2{
    public static void main (String[] args)
    {
        String Name; // Name of the user
        int number;
        int numSq;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print ("Enter your name, please: ");
            Name = scan.nextLine();
            System.out.print ("What is your favorite number?");
            number = scan.nextInt();
        }
        numSq = number * number;
        System.out.printf (Name , ", the square of your number is " 
        + numSq);
    }
}
