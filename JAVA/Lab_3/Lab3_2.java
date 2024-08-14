package sasi;

class Vehicle {
 void drive() {
     System.out.println("Driving a vehicle");
 }
}

class Car extends Vehicle {
 void drive() {
     System.out.println("Repairing a car");
 }
}

public class Lab3_2 {
 public static void main(String[] args) {
     Vehicle myCar = new Car();

     myCar.drive();
 }
}

