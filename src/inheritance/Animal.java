package inheritance;

public abstract class Animal {
    protected String name; // for child classes
    public Animal(String name) {
        this.name = name;

    }
    public abstract void makeSound();

    public String getName() {
        return name;
    }
}
