package tasks;

import java.util.Scanner;

public class Fibonachi {

	private static void firstVersion(int count) {

		int sumTwoLastNumbers = 0;
		int firstLastNumber = 0;
		int secondLastNumber = 1;

		System.out.println("Numbers Fibonacci: ");

		for (int i = 0; i < count; i++) {
			sumTwoLastNumbers = firstLastNumber + secondLastNumber;
			firstLastNumber = secondLastNumber;
			secondLastNumber = sumTwoLastNumbers;
			System.out.print(firstLastNumber + " ");
		}
	}

	private static int secondVersion(int count) {

		if (count == 0) {
            return 0;
        } if (count == 1) {
            return 1;
        }
        return secondVersion(count - 1) + secondVersion(count - 2);
    }

	

	public static void main(String[] args) {

		System.out.print("Enter number: ");

        Scanner scanData = new Scanner(System.in);
        int count = scanData.nextInt();

        firstVersion(count);
        System.out.println("");
        for (int i = 1; i <= count; i++) {
            System.out.print(secondVersion(i) + " ");
        }
        scanData.close();
	}

}
