import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        /*Q1) Write a program that prompts the user to enter the number of students and each
        student’s name and score, and finally displays the names of the students with the lowest
        and second-lowest scores.*/
        
	System.out.println("Enter the number of students: ");
	int numStudents = input.nextInt();

	int score;		
	int lowest = 0;
	int secondLowest = 0;
                
	String name = "";
	String student1 = "";
	String student2 = "";
		
	System.out.println("Enter each students' name and score:");
        
	for (int i = 0; i < numStudents; i++) {
		System.out.println("Student: " + (i + 1) + "\nName: ");
                
		name = input.next();
		System.out.println("Score: ");
		score = input.nextInt();

		if (i == 0) {
			lowest = score;
			student1 = name;
		}
		else if (i == 1 && score < lowest) {
			secondLowest = lowest;
			lowest = score;
			student2 = student1;
			student1 = name;
		}
		else if (i == 1) {
			secondLowest = score;
			student2 = name;
		}		
		else if (i > 1 && score < lowest && score < secondLowest) {
			secondLowest = lowest;
			student2 = student1;
			lowest = score;
			student1 = name;
		}
		else if (i > 1 && score < secondLowest) {
			student2 = name;
			secondLowest = score;
		}
	}
                
	System.out.println("Lowest scoring student: " + student1);
        System.out.println("Second lowest scoring student: " + student2);
        
        
        /*Q2) Write a program that displays all the numbers from 100 to 200, ten per line, that are
        divisible by 3 or 4, but not both. Numbers are separated by exactly one space.*/
        
        int numLine = 10;
	int count = 0;
	
	for (int i = 100; i <= 200; i++) {
		if (i % 3 == 0 && i % 4 == 0) {
			count++;
			if (count % numLine == 0){
				System.out.println(i);
                        }
                        else{
				System.out.println(i + " ");	
                        }
		}
	}
        
        /* Couldn't figure out Q3 :( */
        
        /*Q4) Write a program that prompts the user to enter a string and displays the string in
        reverse order.*/
        
	System.out.print("Enter a string: ");
	String string = input.next();

	String reverse = "";
	for (int i = string.length() - 1; i >= 0; i--) {
		reverse += string.charAt(i);
	}

	System.out.println("The reversed string is " + reverse);
                
    }
    

    
}