package OOP.Abstraction;
//  In Abstraction when we declare the class as abstarct we can declare all the methods that has 
//  no implementation in that abstarct class and also methods that has implementation 
//  the methods that has implementation in abstract class can be called using the child class(which extends the abstarct class) instance 
//  and we can also declare static methds in abstract class and static properties
//  and in abstract class we have constructor also and called when child class object is created
// NOTE : FOR Abstract Class we cant create object 
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sayHello(); // methods in abstract class that has implementation
        Animal.eat(); // static methods
    }
}
