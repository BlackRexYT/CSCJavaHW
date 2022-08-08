import java.util.Scanner;

public class Main {
    public static void countOccurence(int[] list) {
        for (int i = 1; i <= 50; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i){
                    count += 1;
                }
            }
            if (count != 0){
                System.out.printf("%d occurs %d %s%n", i, count, "times");
            }
        }
    }
    
    public static int average(int[] array) {
        int sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array) 
            sum += val;
        return sum / array.length;
    }
    
    public static int[] eliminateDuplicates(int[] list) {
		int[] distinctList = new int[list.length];
		int i = 0;
		for (int e: list) {
			if (linearSearch(distinctList, e) == -1) {
				distinctList[i] = e;
				i++;
			}
		}
		return distinctList;
    }
    
    public static int linearSearch(int[] array, int key) {
	for (int i = 0; i < array.length; i++) {
		if (key == array[i])
			return i;
	}
	return -1;
    }
    
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
        /*Q1) Write a program that reads the integers between 1 and 50 and counts the occurrences of
        each. Assume the input ends with 0. Here is a sample run of the program:*/  
        
        int[] values = new int[100];
        int inputNum;
        int count = 0;
        System.out.println("Enter the integers between 1 and 50: ");
        do{
            inputNum = input.nextInt();
            values[count] = inputNum;
            count += 1;
        }
        while (inputNum != 0);{
            countOccurence(values);
        }
        
        /*Q2) Write two overloaded methods that return the average of an array with the following
        headers: */
        
        double[] vals = new double[10];
        System.out.print("Please enter to double values: ");

        for (int i = 0; i < 10; i++) 
            vals[i] = input.nextDouble();
    
        System.out.printf("The average is: %.2f", average(vals));
        
        /*Q3) Write a method that returns a new array by eliminating the duplicate values in the array
        using the following method header: */
        
        int[] numbers = new int[10];

	System.out.println("Enter ten number: ");
	for (int i = 0; i < numbers.length; i++){
		numbers[i] = input.nextInt();
        }
        
	int[] distinctNumbers = eliminateDuplicates(numbers);

	System.out.println("The distinct numbers are:");
        
	for (int e: distinctNumbers){
		if (e > 0)
			System.out.println(" " + e);
	}
        
	System.out.println();
        
        
        /*I don't know how to do Q4, I tried like 5 different things and none worked.*/
    }       
}