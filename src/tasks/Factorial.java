package tasks;

import java.util.Scanner;

public class Factorial {
	
	private static void factorial(int startNumber) {

		long factorial = 1;

		for (int i = 1; i <= startNumber; i++) {
			factorial *= i;
		}

		System.out.print(startNumber + "! = " + factorial);
	}

    public static void main(String[] args) {

        System.out.print("Enter number for calculate factorial: ");
        
        Scanner scanData = new Scanner(System.in);
        int startNumber = scanData.nextInt();

        factorial(startNumber);
        scanData.close();
    }

}
