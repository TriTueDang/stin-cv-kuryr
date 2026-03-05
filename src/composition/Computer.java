package composition;

public class Computer {
    private final CPU cpu;

    public Computer(String model) {
        this.cpu = new CPU(model);

    }

    public void start() {
        System.out.println("Computer is starting...");
        cpu.process();
    }
}
