import java.util.Scanner;

public class Main {
    /*Q1) Write the methods with the following headers:
    // Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int number)
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number)
    Use the reverse method to implement isPalindrome. A number is a palindrome if its
    reversal is the same as itself. Write a test program that prompts the user to enter an integer
    and reports whether the integer is a palindrome.*/
    
    public static int reverseNum(int number) {
	String reverseNum = ""; 	
	String n = number + ""; 
	for (int i = n.length() - 1; i >= 0; i--) {
            reverseNum += n.charAt(i);
	}
	return Integer.parseInt(reverseNum); 
    }
        
    public static boolean isPalindrome(int number) {
        return number == reverseNum(number) ? true : false;
    }
    
    public static double calcPI(double n) {
	double pi = 0;		
                
	for (double i = 1; i <= n; i ++) {
		pi += Math.pow(-1, i +1) / (2 * i - 1);
	}
                
	pi *= 4;
                
	return pi;
    }
    
    public static int countLetters(String s) {
	int letterNum = 0; 
                
	for (int i = 0; i < s.length(); i++) {
		if (Character.isLetter(s.charAt(i))){
                    letterNum++;
                } 
	}
                
	return letterNum;
    }
         
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter an number: ");
        
        int number = input.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
        
        /*Q2) 𝝅 can be computed using the following summation:
        Write a method that returns m(i) for a given i and write a test program that displays the
        following table:*/
        
        double start = 1;			
        double end   = 901;
    
        System.out.println("\ni           m(i)     ");
        System.out.println("---------------------");
    
        for (double i = start; i <= end; i += 100) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", calcPI(i));
        }
          
        /*Q3) Write a method that counts the number of letters in a string using the following header:
        public static int countLetters(String s)
        Write a test program that prompts the user to enter a string and displays the number of letters
        in the string.*/

	System.out.println("Enter a string: ");
        
	String string = input.next();

	System.out.println("The number of letters in the string are" + countLetters(string));        
        
    }
    

    
}