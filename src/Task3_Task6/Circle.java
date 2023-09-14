package Task3_Task6;

public class Circle {
    private Point centerPoint;
    private double radius;

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle{" +
                "radius=" + radius +
                ", center(X)=" + centerPoint.getX() +
                ", center(Y)=" + centerPoint.getY() +
                "}";
    }

    public float getArea(){
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    public float getLength(){
        return (float) (2 * Math.PI * this.radius);
    }

    Circle(double radius, Point centerPoint){
        this.radius = radius;
        this.centerPoint = centerPoint;
    }
}
