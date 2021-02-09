package edu.vcentry;

public class Exercise3 {

	public static void main(String[] args) {

		int myNum1 = 160, myNum2 = 180, myNum3 = 295;
		if ((myNum1 > myNum2) && (myNum1 > myNum3)) {
			System.out.println(myNum1 + " is the greatest");
		} else if ((myNum2 > myNum3) && (myNum2 > myNum1)) {
			System.out.println(myNum2 + " is the greatest");
		} else {
			System.out.println(myNum3 + " is the greatest");
		}
	}

}
