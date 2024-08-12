package Sasi;
import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i = 65; i <=n; i++)  
		{  
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
		}  
	}

}
