package Sasi;

public class dog {
   
     String name;
     String breed;

    
    dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    public void updateDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    
    public static void main(String[] args) {
        
        dog dog1 = new dog("Browny", "Rat Willar");
        
        System.out.println("Original details of dog1:");
        dog1.updateDetails();

       
        dog1.setName("Blacky");
        dog1.setBreed("Dobbar Man");

       
        System.out.println("Updated details of dog1:");
        dog1.updateDetails();
    }
}
