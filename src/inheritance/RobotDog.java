package inheritance;

public class RobotDog implements SoundMaker {
    String name;
    public RobotDog(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Robot Dog");
    }
}
