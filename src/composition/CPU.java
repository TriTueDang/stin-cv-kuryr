package composition;

public class CPU {
    private final String model;
    public CPU(String cpuModel) {
        this.model = cpuModel;
    }

    public void process() {
        System.out.println("CPU is processing...");
    }
}
