package sasi;



class Shape {
 public double getArea() {
     System.out.println("Shape class: Area calculation is not defined.");
     return 0;
 }
}

class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 public double getArea() {
     return length * width;
 }
}

public class Lab3_3 {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(5.0, 3.0);

     System.out.println("The area of the rectangle is: " + rectangle.getArea());
 }
}

