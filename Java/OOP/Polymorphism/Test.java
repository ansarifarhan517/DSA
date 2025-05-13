package OOP.Polymorphism;

/**
 * The Test class demonstrates polymorphism in Java.
 * <p>
 * In this example, an object of type {@link Cat} is created, but its reference is of type {@link Animal}.
 * This means that at compile-time, only the properties and methods defined in {@code Animal} are accessible.
 * The method {@code makeSound()} is overridden in {@code Cat}, and polymorphism allows the overridden method to be called.
 * </p>
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat(); // Parent class reference to a Child class object (Polymorphism)
        System.out.println(cat.makeSound()); // Calls Cat's overridden method at runtime
        
        cat.setIsCarnivorous(true);
        System.out.println(cat.getIsCarnivorous());
        System.out.println(sum("a","b"));


      
        
        // Note: Although 'cat' is actually a Cat, only methods in Animal are accessible directly.
        // For example, the following would cause a compile-time error:
        // cat.setAge(5);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(String c, String d){
        return 1;
    }
}
