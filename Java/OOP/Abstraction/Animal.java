package OOP.Abstraction;

public abstract class Animal {
    public static double PI;

    public Animal() { // Constructor is called when child class object is created 
        System.out.println("Abstract Class Constructor called");
        PI = 3.14;
    }

    public abstract void makeSound();

    public static void eat(){
        System.out.println("Animal is Eating");
        
    }
    public void sayHello(){
        System.out.println("Hello");
    }
}
