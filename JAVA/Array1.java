package Sasi;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=5;
		int a[]=new int [5];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.print(a[i]+" ");
		}
	}

}
