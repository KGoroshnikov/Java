package TASK_4.n2;

public class Monitor {

    private int[] res = new int[]{};

    Monitor(int[] res){
        this.res = res;
    }
    @Override
    public String toString(){
        return "Monitor: " + this.res[0] + " x " + this.res[1];
    }
}