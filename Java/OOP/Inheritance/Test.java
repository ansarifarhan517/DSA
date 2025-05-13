package OOP.Inheritance;

/**
 * The Test class demonstrates inheritance in Java by directly using a
 * reference of the child class {@link Cat}. 
 * <p>
 * In this example, the object <code>cat</code> is created as a <code>Cat</code>,
 * which means it has access to all methods defined in both the {@link Cat} class 
 * and its parent class {@link Animal}. The method {@code makeSound()} is overridden
 * in {@code Cat} to provide a specific behavior.
 * </p>
 */
public class Test {
    public static void main(String[] args) {
        // Creating an instance of Cat. Since the reference is of type Cat,
        // you can call both Cat-specific methods and the methods inherited from Animal.
        Cat cat = new Cat();
        
        // Calling the overridden method from Cat. This will print "make Mewoo".
        System.out.println(cat.makeSound());
        
        // Using the inherited setter method from Animal to set the carnivorous property.
        cat.setIsCarnivorous(true);
        
        // Using the inherited getter method from Animal to retrieve the carnivorous property.
        System.out.println(cat.getIsCarnivorous());
    }
}

// Explanation
// Inheritance:
// The Cat class extends the Animal class, inheriting all its non-private properties and methods. This means that methods like setIsCarnivorous() and getIsCarnivorous() are available in the Cat class even though they were originally defined in Animal.

// Direct Child Reference:
// In this version of the code, the reference is explicitly of type Cat, so you not only have access to the methods declared in Animal (like setIsCarnivorous() and getIsCarnivorous()), but also any additional methods or properties declared in Cat (for example, if there were a method like setAge()).
