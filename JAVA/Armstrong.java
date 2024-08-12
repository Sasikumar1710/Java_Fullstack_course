package Sasi;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int originalNumber, rem, result = 0;

	        originalNumber = n;

	        while (originalNumber != 0)
	        {
	            rem = originalNumber % 10;
	            result += rem*rem*rem;
	            originalNumber /= 10;
	        }

	        if(result == n)
	            System.out.println(n + " is an Armstrong number.");
	        else
	            System.out.println(n + " is not an Armstrong number.");

	}

}
