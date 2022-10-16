public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){}
    private Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius=" + radius + super.toString() + ", Area = " + getArea()+ "\n";
    }

    @Override
    public void resize(double percent) {
        this.radius *= (percent/200);
    }
}
