package employee;

public class Freelancer extends Employee {

    public Freelancer(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(name + " is working as a freelancer.");
    }
}
