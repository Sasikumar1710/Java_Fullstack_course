package Sasi;
import java.util.Scanner;
public class Greater_than {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
	}

}
