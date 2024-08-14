package sasi;


import java.util.Scanner;
class BankAccount{
	int deposit;
	int withdraw;
	void deposit() {
		Scanner sc=new Scanner(System.in);
		deposit=sc.nextInt();
	}
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		withdraw=sc.nextInt();
	}
}
class SavingsAccount extends BankAccount{
	void value() {
		
	    System.out.println("Before withdraw prevention:"+withdraw);
		
		  for(int i=1;i<100;i++)
		  {
			  while(withdraw<100) {
			  withdraw=i+withdraw;
		  }
		}
	}
void display() {
	if(withdraw>=100)
	{
	System.out.println("Withdrawal account prevented");
	System.out.println("After preventing:"+withdraw);
	}
}}
public class Lab3_5 
{
  public static void main(String[] args)
  {
	  SavingsAccount obj=new SavingsAccount();
	  obj.withdraw();
	  obj.value();
	  obj.display();
  }
}
