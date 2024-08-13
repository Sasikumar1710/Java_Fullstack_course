package Sasi;

public class rectangle {
	
	int length;
	int width;
	
	rectangle(int l,int w){
		this.length=l;
		this.width=w;
	}
	
	void area() {
		System.out.println("Area of Rectangle : "+(length*width));
	}
	
	void perimeter() {
		System.out.println("Area of Rectangle : "+(2*(length*width)));

		
	}

	public static void main(String[] args) {
		rectangle obj=new rectangle(10,20);
		obj.area();
		obj.perimeter();

	}

}
