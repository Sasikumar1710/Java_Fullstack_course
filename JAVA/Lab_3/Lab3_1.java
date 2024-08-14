package sasi;

class Animal {
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

class Cat extends Animal {
 void makeSound() {
     System.out.println("Cat says: Meow");
 }
}

public class Lab3_1 {
 public static void main(String[] args) {
     Animal myCat = new Cat();

     myCat.makeSound();
 }
}
