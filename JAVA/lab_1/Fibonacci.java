package Sasi;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int n1=0,n2=1,n3; 
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(int i=2; i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }  

	}

}
