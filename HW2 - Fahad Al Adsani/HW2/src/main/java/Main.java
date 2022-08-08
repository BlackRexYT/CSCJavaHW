import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        /*Q1) Write a program that randomly generates an integer between 1 and 12 and displays
        the English month names January, February, . . . , December for the numbers 1, 2, . . . ,
        12, accordingly.*/
        
        
        double randomNumMonth = Math.random();
        int randomNumMonthInt;
        
        randomNumMonthInt = 1 + (int) (randomNumMonth * 12);
        
        switch(randomNumMonthInt) {
            case 1:
                System.out.println(randomNumMonthInt + " January");
                break;
            case 2:
                System.out.println(randomNumMonthInt + " February");
                break;
            case 3:
                System.out.println(randomNumMonthInt + " March");
                break;
            case 4:
                System.out.println(randomNumMonthInt + " April");
                break;
            case 5:
                System.out.println(randomNumMonthInt + " May");
                break;
            case 6:
                System.out.println(randomNumMonthInt + " June");
                break;
            case 7:
                System.out.println(randomNumMonthInt + " July");
                break;
            case 8:
                System.out.println(randomNumMonthInt + " August");
                break;
            case 9:
                System.out.println(randomNumMonthInt + " September");
                break;
            case 10:
                System.out.println(randomNumMonthInt + " October");
                break;
            case 11:
                System.out.println(randomNumMonthInt + " November");
                break;
            case 12:
                System.out.println(randomNumMonthInt + " December");
                break;
              
        }
        
        
        /*Q2) Write a program that prompts the user to enter three integers and display the integers
        in decreasing order.*/
        
        
        System.out.println("Enter 3 numbers to see them in descending order");
        
        double userInput1 = input.nextDouble();
        double userInput2 = input.nextDouble();
        double userInput3 = input.nextDouble();
        
        if (userInput1 > userInput2 && userInput2 > userInput3){
            System.out.println(userInput1 + " " + userInput2 + " " + userInput3);
        }
        else if (userInput1 < userInput2 && userInput2 > userInput3){
            System.out.println(userInput2 + " " + userInput1 + " " + userInput3);
        }
        else if (userInput1 < userInput2 && userInput2 < userInput3){
            System.out.println(userInput3 + " " + userInput2 + " " + userInput1);
        }
        else if (userInput1 > userInput2 && userInput2 < userInput3){
            System.out.println(userInput1 + " " + userInput3 + " " + userInput2);
        }
        else{
            System.out.println("They're equal");
        }
        
        
        /*Q3) Write a program that prompts the user to enter a three-digit integer and determines
        whether it is a palindrome integer. An integer is palindrome if it reads the same from right
        to left and from left to right. A negative integer is treated the same as a positive integer.
        Here are sample runs of this program:*/
        
        
        System.out.println("Enter a three digit number to see if it's a palindrome");
        
        int userInputQ3 = input.nextInt();
        
        int firstDigit = userInputQ3 / 100;
        int lastDigit = userInputQ3 % 10;
        
        if (firstDigit == lastDigit){
            System.out.println(userInputQ3 + " is a palindrome");
        }
        else{
            System.out.println(userInputQ3 + " is not a palindrome");
        }
    }
}
