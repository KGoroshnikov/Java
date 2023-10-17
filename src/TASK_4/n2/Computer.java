package TASK_4.n2;

public class Computer {
    private final Brand brand;
    private final Memory memory;
    private final Monitor monitor;
    private final Processor processor;

    public Computer(Brand brand, Memory memory, Monitor monitor, Processor processor){
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public String toString(){
        return "PC: " + this.brand + "\n    " + this.memory + "\n    " + this.monitor + "\n    " + this.processor;
    }

    public static void main(String [] args){
        Computer pc1 = new Computer(Brand.HP, new Memory(512), new Monitor(new int[]{1920, 1080}), new Processor("INTEL"));
        Computer pc2 = new Computer(Brand.Asus, new Memory(1024), new Monitor(new int[]{2560, 1440}),new Processor("AMD"));

        System.out.println(pc1);
        System.out.println(pc2);
    }
}
