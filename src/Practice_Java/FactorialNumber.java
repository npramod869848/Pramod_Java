package Practice_Java;

import java.util.Scanner;

public class FactorialNumber 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //Create a Scanner Object//Scanner class, which allows the program to read input from the user.
        System.out.println("Enter any number:");
        int number = sc.nextInt(); //nextInt() method of the Scanner class to read an integer input from the user and store it in the number variable.
        int fact = 1; //This line initializes a variable fact to store the factorial of the input number. It is initially set to 1 because the factorial of 0 and 1 is 1.
        
        //for(int i=number; i>=1; i--) //This loop calculates the factorial of the input number. Starting from number, it iterates in reverse order until i reaches 1.
        for (int i = 1; i <= number; i++) 
        {	
            fact = fact * i; //In each iteration, the value of i is multiplied with the current value of fact, updating the value of fact.
        }
        
        System.out.println("Factorial of " + number + " is: " + fact); //This line prints the calculated factorial of the input number.
    }
}
