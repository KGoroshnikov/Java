package TASK_4.n2;

public class Memory{
    private final int mem;

    Memory(int mem){
        this.mem = mem;
    }
    @Override
    public String toString(){
        return "Memory: " + this.mem + "GB";
    }
}