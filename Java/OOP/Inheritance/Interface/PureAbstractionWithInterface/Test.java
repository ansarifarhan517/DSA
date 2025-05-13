package OOP.Inheritance.Interface.PureAbstractionWithInterface;

/*
    -Interface is Blueprint of class and Class is BluePrint of Objects
    -Via Interface we achieve -Pure Abstraction - Multiple Inheritance
    -In Iterface we cant create Methods that has implemntations
    -In Interface we can only add methods that has no implementations
    -In Interface we can have static methods and can be used by Interface Name 
    -In Interface we cant have Constructors
    -All variables in an interface are implicitly: -public -static -final



     
*/
public class Test {
    public static void main(String[] args) {
        Animal.eat();
        System.out.println(Animal.ani);
        Animal dog = new Dog();
        dog.makeSound();
        // System.out.println(dog.name); // Gives the  Error because dog is Animal type Refrence

        Dog dog1 = new Dog();
        dog.makeSound();
        System.out.println(dog1.name);
    }
}
