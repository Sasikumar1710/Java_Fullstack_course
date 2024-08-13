package Sasi;

public class person {
	int age;
	String Name;

	person(int age,String Name){
		this.age=age;
		this.Name=Name;
		
	}
	
	void display() {
		System.out.println("Age of the Person : "+age);
		System.out.println("Name of the Person : "+Name);

	}

	public static void main(String[] args) {
		person obj=new person(10,"sasi");
		obj.display();
	}

}
