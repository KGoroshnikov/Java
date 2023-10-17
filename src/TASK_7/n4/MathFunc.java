package TASK_7.n4;

public class MathFunc implements MathCalculable{
    public double power(double a, double n){
        return Math.pow(a, n);
    }

    public double complexModule(double a, double b){
        return power(a*a + b*b, 0.5);
    }

    public double circleLength(double r){
        return 2 * PI * r;
    }

}