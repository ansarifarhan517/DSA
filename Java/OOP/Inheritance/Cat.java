package OOP.Inheritance;

/**
 * The Cat class extends the Animal class, inheriting its properties and methods.
 * This is an example of inheritance in object-oriented programming.
 */
public class Cat extends Animal {

    private int age;

    /**
     * Returns the age of the cat.
     *
     * @return the cat's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the cat.
     *
     * @param age the cat's age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the sound made by the cat.
     * This method overrides the makeSound() method in the Animal class.
     *
     * @return a string representing the cat's sound.
     */
    @Override
    public String makeSound() {
        return "make Mewoo";
    }
}
