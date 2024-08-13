package Sasi;

import java.util.Scanner;
class Bankdetial
{
	String holdername;
	String accountnum;
	double deposit;
	double withdraw;
   void addvalues()
   {
	  Scanner sc=new Scanner(System.in);
	  accountnum=sc.nextLine();
	  holdername=sc.nextLine();  
	  deposit=sc.nextDouble();
	  withdraw=sc.nextDouble();
	  
   }
   void display()
   {
	   System.out.println("Account  holders name:"+holdername);
		  System.out.println("Account number:"+accountnum);
		  System.out.println("Deposit amount:"+deposit);
		  System.out.println("Withdraw amount:"+withdraw);
   }
 void delete(double withdraw)
 {
	 this.withdraw=withdraw;
 } 
 }
public class Account 
{
   public static void main(String[] args)
   {
	   Bankdetial obj=new Bankdetial();
	   obj.addvalues();
	   obj.display();
	   Bankdetial obj2=new Bankdetial();
	   obj2.addvalues();
	   System.out.println("To set null value to deposit:");
	   obj2.delete(0);
	   obj2.display();   
   }
}