import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /* Q1) Compute the volume of a triangle by writing a program that reads in the length of
        sides of an equilateral triangle and computes the area and volume using the following
        Formulas: */
        
        System.out.println("Enter length of the sides and height of the Equilateral");
        double length = input.nextDouble();
        double lengthPow;
        double area;
        double volume;
        
        lengthPow = Math.pow(length, 2);
        area = (Math.sqrt(3)/4) * lengthPow;
        volume = area * length;
        
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);
        
        

        
        /* Q2) Find the number of years by writing a program that prompts the user to enter the
        minutes (e.g., 1 billion), and displays the number of years and remaining days for the
        minutes. For simplicity, assume that a year has 365 days. Here is a sample run:*/
        
        System.out.println("Enter the number of minutes");

        int minutes = input.nextInt();
        int hours;
        int daysRemaining;
        int days;
        int years;

        hours = minutes / 60;
        days = hours / 24;
        years = days / 365;
        daysRemaining = days % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + daysRemaining + " days");
        
        
        
        /* Q3) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by
        taking your weight in kilograms and dividing, by the square of your height in meters. Write a
        program that prompts the user to enter a weight in pounds and height in inches and displays
        the BMI. Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a
        sample run: */
        
        
        double kgConvert;
        double meterConvert;
        double BMI;
        double meterPow;
        System.out.println("Enter weight in lbs");
        double pounds = input.nextDouble();
        System.out.println("Enter height in inches");
        double inches = input.nextDouble();
        
        kgConvert = pounds * 0.453592371;
        meterConvert = inches * 0.0254;
        
        meterPow = Math.pow(meterConvert, 2);
        
        BMI = (kgConvert)/meterPow;
        
        System.out.println("BMI is " + BMI);
        
        
    }
}
