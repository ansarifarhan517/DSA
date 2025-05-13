package OOP.Inheritance.Interface.PureAbstractionWithInterface;

public interface Animal {

    static String ani = "Default Animal";
    
    void makeSound();

    static void eat(){
        System.out.println("ANimal is Eating");
    }
    
}