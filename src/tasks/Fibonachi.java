package tasks;

import java.util.Scanner;

public class Fibonachi {

	private static void firstVersion(int count) {

		long[] arrayFIb = new long[count + 2];
		arrayFIb[0] = 0;
		arrayFIb[1] = 1;

		for (int i = 2; i <= count + 1; i++) {

			arrayFIb[i] = arrayFIb[i - 1] + arrayFIb[i - 2];

			System.out.print(arrayFIb[i - 2] + " ");
		}
		System.out.println("");
	}

	private static void secondVersion(int count) {

		long[] arrayFIb = new long[count + 2];

		for (int i = 0; i <= count; i++) {

			if (i < 2) {
				arrayFIb[i] = 1;
			} else {
				arrayFIb[i] = arrayFIb[i - 1] + arrayFIb[i - 2];
			}
			
			System.out.print(arrayFIb[i] + " ");
			
		}

	}

	public static void main(String[] args) {

		System.out.print("Enter number: ");

		Scanner scanData = new Scanner(System.in);
		int count = scanData.nextInt();

		firstVersion(count);
		secondVersion(count);
		
		scanData.close();
	}

}
