package sasi;


class employee{
	void work() 
	{
	  System.out.println("Works");
	}
	void getSalary() {
		System.out.println("Salary of Employee");
	}
}
class HRManager extends employee{
	void addEmployee() {
		System.out.println("Employee added.");
	}
}
public class Lab3_4 
{
  public static void main(String[] args)
  {
	  HRManager obj=new HRManager();
	  obj.work();
	  
  }
}
