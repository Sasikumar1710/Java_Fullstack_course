package Sasi;


class circle {
    
    double radius;

    
    circle(double radius) {
        this.radius = radius;
    }

    
    double getRadius() {
        return radius;
    }

    
    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14*radius*radius;
    }

   double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
   
   void display() {
	   System.out.println("Initial Radius: " + getRadius());
       System.out.println("Area: " + calculateArea());
       System.out.println("Circumference: " + calculateCircumference());
   }

    public static void main(String[] args) {
        circle circle = new circle(4.5);
        circle.display();

        

        circle.setRadius(9.5);
        System.out.println("\nAfter set the radius:");
        circle.display();

       
    }
}







