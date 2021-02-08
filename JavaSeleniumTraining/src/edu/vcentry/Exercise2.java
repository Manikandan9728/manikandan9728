package edu.vcentry;

public class Exercise2 {

	public static void main(String[] args) {

		int myNum1 = 50, myNum2 = 80, myNum3 = 95;

		if (myNum1 > myNum2) {
			System.out.println(myNum1 + " is the greatest");
		} else if (myNum2 > myNum3) {
			System.out.println(myNum2 + " is the greatest");
		} else if (myNum3 > myNum1) {
			System.out.println(myNum3 + " is the greatest");
		}

	}
}