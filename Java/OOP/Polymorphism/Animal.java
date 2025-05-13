package OOP.Polymorphism;

/**
 * The Animal class serves as the parent class in this inheritance example.
 * It defines common properties and behaviors for animals.
 */
public class Animal {
    String name;
    private boolean isCarnivorous;

    /**
     * Returns the sound made by the animal.
     * Subclasses can override this method to provide specific sounds.
     *
     * @return a string representing the sound.
     */
    public String makeSound() {
        return "make Sound";
    }

    /**
     * Returns whether the animal is carnivorous.
     *
     * @return true if the animal is carnivorous; false otherwise.
     */
    public boolean getIsCarnivorous() {
        return isCarnivorous;
    }

    /**
     * Sets the carnivorous property for the animal.
     *
     * @param isCarnivorous true if the animal is carnivorous; false otherwise.
     */
    public void setIsCarnivorous(boolean isCarnivorous) {
        this.isCarnivorous = isCarnivorous;
    }
}
