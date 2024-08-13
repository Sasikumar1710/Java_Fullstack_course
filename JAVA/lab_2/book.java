package Sasi;

import java.util.Scanner;
class Book{
	String title;
	String author;
	double ISBN;
	String str[]=new String[4];
	void getvalue()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			str[i]=sc.nextLine();
		}
	}
	void addbookdata()
	{
		System.out.println("Details of the Book");
		for(int i=0;i<3;i++)
		{
			System.out.print(str[i]+",");
		}
	}
	
	public class book 
	{
	public static void main(String[] args) {
    Book obj=new Book();
    obj.getvalue();
    obj.addbookdata();
}}
}