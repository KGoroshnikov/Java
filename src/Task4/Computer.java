package Task4;

public class Computer {
    private int id;
    private String cpu;
    private String gpu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Computer{" +
                "id=" + id +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                "}";
    }

    Computer(int id, String cpu, String gpu){
        this.cpu = cpu;
        this.gpu = gpu;
        this.id = id;
    }

}
