package OOP.Encapsulation;

// Encapsulation is the bundling of data and methods into a single unit (a class).
// It makes the data private so that it can only be accessed and modified via the class's methods.
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        
        car.setColor("pink");
        car2.setColor("blue");
        
        System.out.println(car.getColor());   // Output: pink
        System.out.println(car2.getColor());  // Output: blue
    }
}
