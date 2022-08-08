import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        /*Q1) Write a program that prompts the user to enter the length from the center of a
        pentagon to a vertex and computes the area of the pentagon, as shown in the following
        figure. */
        
        
        System.out.println("Enter the radius for the pentagon");
        double radiusInput = input.nextDouble();
        
        double areaPenta;
        
        areaPenta = (5 * Math.pow(radiusInput, 2)) * Math.sqrt((5 + Math.sqrt(5)) / 2) / 4;
        
        System.out.println("The area of the Pentagon is: " + areaPenta);
        
        
        /*Q2) Write a program that prompts the user to enter two characters and displays the major
        and status represented in the characters. The first character indicates the major and the
        second is number character 1, 2, 3, 4, which indicates whether a student is a freshman,
        sophomore, junior, or senior. */
        
        
        System.out.println("Enter either I, C, or A, for your major: ");
        String majorInput = input.next();
        String major = "Computer Science";
        
        System.out.println("Enter either 1,2,3, or 4, for the level you're at: ");
        int levelInput = input.nextInt();
        String level = "Freshman";
        
        switch(majorInput){
            case "I":
                major = "Information Management";
                break;
            case "C":
                major = "Computer Science";
                break;
            case "A":
                major = "Accounting";
                break;
            default:
                System.out.println("Enter either I, C, or A");
                break;
        }
        
        switch(levelInput){
            case 1:
                level = "Freshman";
                break;
            case 2:
                level = "Sophomore";
                break;
            case 3:
                level = "Junior";
                break;
            case 4:
                level = "Senior";
                break;
            default:
                System.out.println("Enter either 1,2,3, or 4");
                break;
        }
        
        System.out.println(major + " " + level);
        
        
        
        /*Q3) Write a program that prompts the user to enter two strings, and reports whether the
        second string is a substring of the first string.*/
        
        
        
        System.out.println("Enter String: ");
        String stringOne = input.next();
        
        System.out.println("Enter String: ");
        String stringTwo = input.next();
        
        if (stringOne.contains(stringTwo)){
            System.out.println(stringTwo + " is a substring of " + stringOne);
        }
        else{
            System.out.println(stringTwo + " is not a substring of " + stringOne);
        }
    }
}
