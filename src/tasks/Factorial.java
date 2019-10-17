package tasks;

import java.util.Scanner;

public class Factorial {
	
	private static int factorial(int startNumber) {

        if (startNumber < 1) {
            return 1;
        } else {
            return factorial(startNumber - 1) * startNumber;
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number for calculate factorial: ");
        
        Scanner scanData = new Scanner(System.in);
        int startNumber = scanData.nextInt();

        System.out.println(factorial(startNumber) + " ");
        scanData.close();
    }

}
