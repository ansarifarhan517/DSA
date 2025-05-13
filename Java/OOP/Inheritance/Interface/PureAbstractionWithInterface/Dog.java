package OOP.Inheritance.Interface.PureAbstractionWithInterface;

public class Dog implements Animal{

    public String name = "Tommy"; 

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }


    
}
