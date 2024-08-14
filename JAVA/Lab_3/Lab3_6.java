package sasi;


class ani {
    void moves() {
        System.out.println("Run");
    }
}
class Cheetah extends ani{
    void print() {
        System.out.println("Cheetah");
    }
}
public class Lab3_6
{
	public static void main(String[] args) {
        Cheetah obj = new Cheetah();
        obj.print(); 
        obj.moves();  
    }
}